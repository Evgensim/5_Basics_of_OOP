package by.epam.task1;

/*
Создать объект класса Текстовый файл, используя классы Файл, Директория.
* Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.*/

public class TextFile extends File {
	private String bodyText;

	{
		bodyText = "";
	}

	public TextFile(String name) {
		super(name);
		if (name.matches("^\\w+\\.(txt)$")) {
			setFileName(name);
		} else {
			throw new IllegalAccessError("invalid file name for text file");
		}
	}

	public void add(String text) {
		bodyText += text + "\n";
	}

	public void remove() {
		bodyText = "";
	}

	public String output() {
		return bodyText;
	}
}
