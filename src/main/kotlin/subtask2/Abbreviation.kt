package subtask2

class Abbreviation {


    fun abbreviationFromA(a: String, b: String): String {
        var i = 0
        var j = 0
        while (i < a.length && j < b.length) {
            if(a[i].isLowerCase()) {
                if(a[i].toUpperCase() == b[j]){
                    i++
                    j++
                }
                else i++
            }
            else if (a[i] == b[j]) {
                i++
                j++
            }
            else return "NO"
        }
        if (j == b.length) return "YES"
        return "NO"
    }
}
