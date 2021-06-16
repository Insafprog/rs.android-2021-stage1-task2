package subtask1

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*


class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        val importPattern = "dd MM yyyy"
        val exportPattern = "dd MMMM, EEEE"

        return try {
            val import = SimpleDateFormat(importPattern)
            val export = SimpleDateFormat(exportPattern, Locale("ru"))
            import.isLenient = false
            export.format( import.parse("$day $month $year") )
        } catch (e: ParseException) {
            "Такого дня не существует"
        } catch (e: IllegalArgumentException) {
            "Такого дня не существует"
        }
    }
}
