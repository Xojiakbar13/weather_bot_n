package demo_project.bot;

import demo_project.constants.Constants;
import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.Collections;
import java.util.List;

public class WeatherBot extends TelegramLongPollingBot implements Constants {
    @Override
    public String getBotUsername() {
        return BOT_USERNAME;
    }

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }

    @Override
    public void onUpdateReceived(Update update) {
       if (update.hasMessage() && update.getMessage().hasText()){
           handleMessage(update.getMessage());
       }
    }

    @SneakyThrows
    private void handleMessage(Message message) {
        long chatId = message.getChatId();
        String text = message.getText();
        SendMessage sendMessage = new SendMessage();
        InlineKeyboardButton button = new InlineKeyboardButton();
        if (text.equals(START)){
            sendMessage.setChatId(chatId);
            sendMessage.setText(HI);
            sendMessage.enableMarkdownV2(true);
            execute(sendMessage);
        }
        else {
            button.setText(DELETE);
            button.setCallbackData(DELETE);
            sendMessage.setReplyMarkup(new InlineKeyboardMarkup(List.of(Collections.singletonList(button))));
            sendMessage.setText("weather");
            sendMessage.setChatId(chatId);
            sendMessage.enableMarkdownV2(true);
            execute(sendMessage);
        }
    }
}
