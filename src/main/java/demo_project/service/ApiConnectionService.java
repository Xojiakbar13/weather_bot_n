package demo_project.service;

@FunctionalInterface
public interface ApiConnectionService<R> {

    R getConnection(String val);
}
