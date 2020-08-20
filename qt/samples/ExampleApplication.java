import org.bytedeco.javacpp.IntPointer;
import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.PointerPointer;
import org.bytedeco.qt.Qt5Core.QEvent;
import org.bytedeco.qt.Qt5Widgets.QApplication;

import java.io.File;

public class ExampleApplication {
    private static Event event = new Event();

    public static void main(String[] args) {
        String path = Loader.load(org.bytedeco.qt.global.Qt5Core.class);
        IntPointer argc = new IntPointer(new int[]{3});
        PointerPointer argv = new PointerPointer("calc", "-platformpluginpath", new File(path).getParent(), null);
        Application application = new Application(argc, argv);
        QApplication.postEvent(application, event);
        System.exit(QApplication.exec());
    }

    public static class Event extends QEvent {
        public Event() {
            super(Type.User);
        }
    }

    public static class Application extends QApplication {
        public Application(IntPointer argc, PointerPointer argv) {
            super(argc, argv);
        }

        @Override
        protected void customEvent(QEvent event) {
            System.out.printf("global event '%s'\n", ExampleApplication.event);
            System.out.printf("local event '%s'\n", event);
        }
    }
}
