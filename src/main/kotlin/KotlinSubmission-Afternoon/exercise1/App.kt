package `KotlinSubmission-Afternoon`.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namaDepan: String = "Muhamad Adib"
    val namaBelakang: String = "Minanurohman"
    val umur: Int = 21
    val status: Boolean = true

    println("Nama : $namaDepan $namaBelakang")
    println("Umur : $umur tahun")
    println("Status : ${if (status) "Single" else "Tidak"}")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID : $groupId")
    println("Group Member : $groupMember")
    println("Session: $session")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val teamMembers = listOf("Syarifah Cahyati", "Ayyash Muhammad Jibril", "William Deoscar Sengiyu", "Muhammad Revanza", "Muhamad Adib Minanurohman")
    val myName = teamMembers[4]
    return teamMembers
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak Jovian", "Kak Imam")
    val countOfGroup = arrayOf<String>("Syarifah Cahyati", "Ayyash Muhammad Jibril", "William Deoscar Sengiyu", "Muhammad Revanza", "Muhamad Adib Minanurohman")
    val total = mentor.size + countOfGroup.size
    return total
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Beta+", listOf("Syarifah Cahyati", "Ayyash Muhammad Jibril", "William Deoscar Sengiyu", "Muhammad Revanza", "Muhamad Adib Minanurohman"), "Afternoon")

}