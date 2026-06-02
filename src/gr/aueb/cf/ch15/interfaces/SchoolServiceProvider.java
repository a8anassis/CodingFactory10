package gr.aueb.cf.ch15.interfaces;

public class SchoolServiceProvider {
    private TeacherServiceImpl teacherService;  // tightly coupled

    public SchoolServiceProvider() {
        teacherService = new TeacherServiceImpl();  // new
    }

    public void register() {
        teacherService.register();
    }

    public void unregister() {
        teacherService.unregister();
    }
}
