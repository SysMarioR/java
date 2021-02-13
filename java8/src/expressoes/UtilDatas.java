package expressoes;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public final class UtilDatas {

	public static LocalDateTime converteFileTimeParaLocalDate(BasicFileAttributes attr) {
		Instant instant = attr.lastModifiedTime().toInstant();
		LocalDateTime data = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		return data;
	}

	public static LocalDateTime converteDateParaLocalDate(Date data) {
		Instant instant = data.toInstant();
		LocalDateTime novaData = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		return novaData;
	}

	public static FileTime converteLocalDateParaFileTime(LocalDateTime data) {
		Instant instant = data.toInstant(ZoneOffset.UTC);
		FileTime dia = FileTime.from(instant);
		return dia;
	}

	public static Date converteLocalDateParaDate(LocalDateTime data) {
		Instant instant = data.toInstant(ZoneOffset.UTC);
		Date dia = Date.from(instant);
		return dia;
	}

	public static String formatadorComHoras (LocalDateTime data) {
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return data.format(formatador);
	}
}
