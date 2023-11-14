package `KotlinSubmission-Afternoon`.exercise4

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    fun main() {
        // Contoh kode untuk mencoba mengonversi input pengguna ke dalam bentuk angka (Int)
        try {
            print("Masukkan sebuah angka: ")
            val userInput = readLine()
            val number = userInput?.toInt() ?: throw NumberFormatException("Input tidak valid")

            // Jika berhasil diubah ke dalam bentuk angka, cetak hasilnya
            println("Angka yang dimasukkan: $number")
        } catch (e: NumberFormatException) {
            // Menangani kesalahan jika input tidak dapat diubah menjadi angka
            println("Terjadi kesalahan: ${e.message}")
        }
    }
