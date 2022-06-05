package study.homework.writing.filewriter;

public class FileAlreadyCreatedException extends RuntimeException {
    public FileAlreadyCreatedException(String message) {
        super(message);
        printStackTrace();
    }
}
