package gr.aueb.cf.ch15.interfaces;

public class SchoolMain {

    public static void main(String[] args) {
        ISchoolService studentService = new StudentServiceImpl();
        ISchoolService teacherService = new TeacherServiceImpl();

        GenericSchoolServiceProvider studentProvider = new GenericSchoolServiceProvider(studentService);
        GenericSchoolServiceProvider teacherProvider = new GenericSchoolServiceProvider(teacherService);

        studentProvider.register();
        teacherProvider.register();

        studentProvider.unregister();
        teacherProvider.unregister();
    }
}
