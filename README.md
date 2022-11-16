[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-c66648af7eb3fe8bc4f294546bfd86ef473780cde1dea487d3c4ff354943c9ae.svg)](https://classroom.github.com/online_ide?assignment_repo_id=9346035&assignment_repo_type=AssignmentRepo)
## Object-oriented Programming (Lab Work) Template Guides
Natasya febriani - 21343010

* Prinsip inheritance pada OOP adalah di mana kita dapat membentuk class baru yang “mewarisi” atau memiliki bagian-bagian dari class yang sudah ada sebelumnya. Konsep ini menggunakan sistem hirarki atau bertingkat. Inheritance dimungkinkan untuk mewarisi atribut dan metode dari satu kelas ke kelas lainnya.   "konsep pewarisan" menjadi dua kategori:
• subclass (anak) - kelas yang mewarisi dari kelas lain
• superclass (induk) - kelas yang diwarisi dari induk
Untuk mewarisi dari kelas, gunakan extends kata kunci.
Contoh pada latihan 1, Roda dua,Roda empat kelas (subclass) mewarisi atribut dan metode dari Kendaraan (superclass).

 * Polimorfisme berarti "banyak bentuk", dan itu terjadi ketika kita memiliki banyak kelas yang terkait satu sama lain melalui pewarisan. 
Warisan memungkinkan kita mewarisi atribut dan metode dari kelas lain. Polimorfisme menggunakan metode tersebut untuk melakukan tugas yang berbeda. 
Hal ini memungkinkan kita untuk melakukan satu tindakan dengan cara yang berbeda.
Contoh pada latihan 3, superclass bernama BANK yang memiliki metode bernama sukuBunga(). Subkelas BANK bisa berupa BANK BRI, BNI, Mandiri, dll.
Dalam Java, terdapat 2 jenis polymorphism yaitu Static 
Polymorphism dan Dynamic Polymorphism.
a) Static Polymorphism yang umum digunakan adalah Method 
Overloading. Method Overloading mengizinkan kalian untuk menerapkan 
beberapa implementasi metode berbeda dalam kelas yang sama namun 
dengan parameter berbeda-beda.
b) Dalam Dynamic Polymorphism sebuah subclass dapat menimpa metode 
dari superclassnya. Jika kalian menerapkan subclass tersebut, Java Virtual 
Machine akan selalu menggunakan metode yang sudah ditimpa.

* Abstraction adalah Proses untuk menyembunyikan detail implementasi dan 
hanya sisi fungsionalitas (gambaran umum) saja yang ditampilkan. 
Abstraction di java terbagi menjadi dua yaitu class abstract dan interface. 
Class Abstract
• Class yang masih bersifat umum/general (perlu didefinisikan ulang)
• Menggunakan keyword abstract di classnya
• Method di dalam classnya boleh abstract ataupun tidak
• Hanya class dan method yang boleh abstract, variable tidak boleh
• Method yang tipenya abstract wajib didefinisikan ulang oleh class 
anaknya (override)
• Tidak dapat di buat object secara langsung.

* Abstract Interface
• Menggunakan keyword interface di classnya dan 
keyword implements di Class yang mengimplementasikannya.
• Variable yang ada didalamnya bersifat public, static, dan final
• Method di dalam classnya semuanya adalah abstract dan public (untuk 
java 7 ke bawah) dan untuk java 8 ke atas ada namanya default method 
dan static method akan dijelaskan lain waktu ya hehe.
• Hanya method yang boleh abstract, variable tidak boleh
• Semua method wajib didefinisikan ulang oleh class anaknya 
(override) karena bersifat abstract.

* Encapsulation
Encapsulation pada OOP adalah konsep tentang pengikatan data atau metode 
berbeda yang disatukan atau “dikapsulkan” menjadi satu unit data. 
Encapsulation dapat memudahkan dalam pembacaan kode karena informasi 
yang disajikan tidak perlu dibaca secara rinci dan sudah merupakan satu 
kesatuan. Encapsulation juga sering digunakan karena terdapat 
fitur information-hiding mechanism. Mekanisme ini menghilangkan akses 
publik ke atribut-atribut yang terdapat di dalam “kapsul” tersebut.
