package gr.aueb.cf.ch15.interfaces;

public class GenericSchoolServiceProvider {
    private final ISchoolService schoolService;   // interface ως private instance

    public GenericSchoolServiceProvider(ISchoolService schoolService) {
        this.schoolService = schoolService;     // όχι new, αλλά DI (Dependency Injection) - IoC (Inversion of Control)
    }

    public void register() {
        schoolService.register();
    }

    public void unregister() {
        schoolService.unregister();
    }
}
