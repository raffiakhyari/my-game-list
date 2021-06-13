package com.example.gamelist.Object

import com.example.gamelist.R

object gameData {

    private val gameAction_Names = arrayOf(
        "Assasins Creed",
        "Monter Hunter World",
        "Fall Guy",
        "Dread Out",
        "Little Nightmare 1",
        "Little Nightmare 2",
        "Resident Evil",
        "Apex Legends",
        "Counter Strike",
        "Valorant"
    )
    private val gameGenre = arrayOf(
        "Action Game",
        "Action Game",
        "Action Game",
        "Horror Game",
        "Horror Game",
        "Horror Game",
        "Horror Game",
        "Shooter Game",
        "Shooter Game",
        "Shooter Game"
    )

    private val gameAction_Detail = arrayOf(
        "Assassin Creed adalah seri permainan video aksi-petualangan dan penyelinapan yang dibuat oleh Patrice Désilets, Jade Raymond dan Corey May, dikembangkan dan diterbitkan oleh Ubisoft menggunakan game engine Anvil. Seri permainan ini menggambarkan pertarungan di antara Assassin, yang memperjuangkan perdamaian dengan kehendak bebas, dan Templar, yang menginginkan perdamaian melalui di bawah kekuasaan. Seri permainan ini menampilkan fiksi sejarah, fiksi sains, dan tokoh-tokoh fiktif, yang dipadukan dengan peristiwa dan tokoh-tokoh sejarah. Pemain akan mengontrol tokoh Assassin di masa lampau lebih sering, sementara mereka dapat pula bermain sebagai Desmond Miles atau Assassin Initiate di masa kini, yang memburu target-target Templar.",
        "Monster Hunter: World adalah game role-playing aksi yang dimainkan dari sudut pandang orang ketiga. Mirip dengan game sebelumnya dalam seri, pemain mengambil peran karakter yang dibuat pemain yang melakukan perjalanan ke \"Dunia Baru\", daratan tak berpenghuni yang dipenuhi monster, untuk bergabung dengan Komisi Penelitian yang mempelajari tanah dari basis komando pusat mereka astera. Komisi Riset menugaskan Pemburu untuk memburu dan membunuh atau menangkap monster besar yang berkeliaran di luar Astera untuk melindungi Komisi dan mempelajari monster di sana. Karakter pemain tidak memiliki atribut intrinsik apa pun, tetapi atribut ini ditentukan oleh peralatan apa yang dilengkapi dengan karakter tersebut. Ini termasuk senjata, yang dipilih dari empat belas arketipe seri (seperti pedang panjang, busur, atau palu), yang kemudian mendefinisikan lebih lanjut jenis gerakan dan kemampuan tempur yang dapat digunakan pemain, dan potongan baju besi, yang dapat menghasilkan keuntungan.",
        "Fall Guys: Ultimate Knockout adalah gim video battle royale platform yang dikembangkan oleh Mediatonic dan diterbitkan oleh Devolver Digital. Hingga 60 pemain mengontrol makhluk seperti kacang jeli dan bersaing satu sama lain dalam serangkaian tantangan, seperti rintangan atau tag. Banyak kursus yang berbeda telah ditambahkan sejak game ini pertama kali dirilis; minoritas berbasis tim, sementara banyak yang tidak perlu jatuh ke dalam slime di atas platform yang berputar dan mengambang dengan rintangan yang dirancang untuk menjatuhkan pemain dan menunggu sejumlah pemain lain untuk dieliminasi, tetapi kebanyakan adalah rintangan yang melibatkan pemain yang berlomba untuk mendapatkannya.",
        "DreadOut adalah sebuah permainan video horor kesintasan Indonesia yang dikembangkan oleh Digital Happiness untuk Windows, Mac OS X dan Linux. ",
        "Little Nightmares terjadi di dunia 2.5D . Pemain melintasi dunia melalui berbagai elemen platformer, terkadang diblokir oleh teka-teki yang harus dipecahkan untuk melanjutkan. Pemain umumnya dibuat tidak berdaya di lingkungan mereka karena kurangnya kemampuan tempur dan harus bergantung pada siluman dan lingkungan untuk bersembunyi dari berbagai musuh. Pada beberapa kesempatan, pemain diberikan alat yang bahkan sedikit peluang dan memungkinkan mereka untuk melawan.",
        "Little Nightmares II adalah game petualangan horor platformer teka-teki yang dikembangkan oleh Tarsier Studios dan diterbitkan oleh Bandai Namco Entertainment . Ini adalah prekuel dari Little Nightmares 2017. Kisah, yang mendahului peristiwa game pertama,mengikuti Mono, yang harus bekerja sama dengan Six, protagonis dari game sebelumnya, untuk bertahan dari kengerian Kota Pale dan menemukan kegelapannya. rahasia. ",
        "Resident Evil Biohazard adalah  permainan bertahan hidup bergenre horor yang dikembangkan dan diterbitkan oleh Capcom, dirilis pada Januari 2017 untuk Microsoft Windows, PlayStation 4 (juga mendukung headset PlayStation VR), Xbox One dan pada Mei 2018 untuk Nintendo Switch di Jepang. Sub kesembilan dalam seri Resident Evil, Resident Evil 7 menyimpang dari yang lebih berorientasi aksi seperti Resident Evil 5 dan Resident Evil 6, kembali ke ajang bertahan hidup nan horor, serta menekankan eksplorasi. Pemain mengontrol Ethan Winters saat dia mencari istrinya di perkebunan yang ditempati oleh keluarga yang terinfeksi, berusaha memecahkan teka-teki dan melawan musuh. Gim ini adalah game seri utama pertama yang menggunakan tampilan first-person.",
        "Apex Legends adalah mengusung konsep permainan battle royale dari permainan tembak-menembak pahlawan. Ceritanya sendiri dimulai 30 tahun setelah peristiwa Titanfall 2. Apex berbeda dari kebanyakan permainan battle royale dengan menggunakan Legend (karakter pahlawan yang memiliki kemampuan unik dan memiliki peran seperti menyerang, bertahan, pendukung dan pengintai). Pemain dikelompokkan ke dalam sebuah tim dengan tiga orang, dengan masing-masing pemain memilih karakter Legend berbeda. Setiap satu pertandingan, ada hingga 20 tim yang beradu jotos. ",
        "Counter Strike: Global Offensive merupakan permainan dengan menggunakan sudut pandang orang pertama. Permainan ini didesain dengan menjadikan pemain sebagai penembak. Pemain dapat bergabung ke dalam kelompok Teroris ataupun Anti-Teroris di mana pemain diharuskan untuk menyelesaikan beberapa misi ataupun melenyapkan kelompok musuh. Permainan ini berlangsung dalam ronde yang pendek dan berakhir apabila pemain terkalahkan ataupun misi telah diselesaikan. Dalam kebanyakan mode permainan, seorang pemain yang kalah harus menunggu sampai ronde permainan selesai untuk dapat berpartisipasi kembali.",
        "Valorant adalah penembak taktis berbasis tim dan penembak orang pertama yang diatur dalam dekat masa depan. Pemain bermain sebagai salah satu dari sekumpulan agen, karakter yang dirancang berdasarkan beberapa negara dan budaya di seluruh dunia. Dalam mode permainan utama, pemain ditugaskan ke tim menyerang atau bertahan dengan masing-masing tim memiliki lima pemain di dalamnya. "
    )

    private val gameAction_Images = intArrayOf(
        R.drawable.assasins,
        R.drawable.monsterhunter,
        R.drawable.fallguy,
        R.drawable.dreadout,
        R.drawable.little_nightmare1,
        R.drawable.little_nightmare2,
        R.drawable.resident_evil,
        R.drawable.apex,
        R.drawable.csgo,
        R.drawable.valorant
    )


    val listData_Action: ArrayList<Game>
        get() {
            val list = arrayListOf<Game>()
            for (position in gameAction_Names.indices){
                val gameAction = Game()
                gameAction.name = gameAction_Names[position]
                gameAction.genre_game = gameGenre[position]
                gameAction.detaill_game = gameAction_Detail[position]
                gameAction.images = gameAction_Images[position]

                list.add(gameAction)
            }
            return list
        }


}