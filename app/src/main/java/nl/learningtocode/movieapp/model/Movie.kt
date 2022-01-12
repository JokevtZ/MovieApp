package nl.learningtocode.movieapp.model

data class Movie(
    val id : String,
    val title : String,
    val duration : String,
    val images : List<String>,
    )

fun getMovies() : List<Movie> {
    return listOf(
        Movie(
            id = "1",
            title = "Captain America: The First Avenger",
            duration = "124 minutes",
            images = listOf("https://oyster.ignimgs.com/wordpress/stg.ign.com/2018/04/3a56665633a136fa165e60e39e9dcbaf-720x479.jpg")
        ),

        Movie(
            id = "2",
            title = "Agent Carter",
            duration = "18 episodes",
            images = listOf("https://prod-ripcut-delivery.disney-plus.net/v1/variant/disney/CF780BAB1B440A9DF57EC8534305670A41BF4C2BE12345FDE90129102A06C5D5/scale?width=1200&aspectRatio=1.78&format=jpeg")
        ),

        Movie(
            "3",
            "Captain Marvel",
            "124 minutes",
            images = listOf("https://images.pathe-thuis.nl/18157_378x538.jpg")
        ),

        Movie(
            "4",
            "Iron Man",
            "126 minutes",
            images = listOf("https://images.pathe-thuis.nl/13974_1280x720.jpg")
        ),

        Movie(
            "5",
            "The Incredible Hulk",
            "112 minutes",
            images = listOf("https://images.pathe-thuis.nl/14845_450x640.jpg")
        ),

        Movie(
            "6",
            "Iron Man 2",
            "125 minutes",
            images = listOf("https://images.pathe-thuis.nl/12166_450x640.jpg")
        ),

        Movie(
            "7",
            "Thor",
            "114 minutes",
            images = listOf("https://static.wikia.nocookie.net/disney/images/4/4a/Thor_Odinson_TDW_poster_textless.jpg/revision/latest?cb=20130615173905")
        ),

        Movie(
            "8",
            "The Avengers",
            "143 minutes",
            images = listOf("https://oyster.ignimgs.com/wordpress/stg.ign.com/2018/04/a80ab0eb2ed55f029cf6a7e57c4a9931-720x405.png")
        ),

        Movie(
            "9",
            "Iron Man 3",
            "131 minutes",
            images = listOf("https://images.pathe-thuis.nl/12164_450x640.jpg")
        ),

        Movie(
            "10",
            "Thor: The Dark World",
            "112 minutes",
            images = listOf("https://oyster.ignimgs.com/wordpress/stg.ign.com/2018/04/sab1035_comp_v042-1153-720x479.jpg")
        ),

        Movie(
            "11",
            "Captain America: The Winter Soldier",
            "136 minutes",
            images = listOf("https://images.pathe-thuis.nl/12170_378x538.jpg")
        ),

        Movie(
            "12",
            "Guardians of the Galaxy",
            "122 minutes",
            images = listOf("https://oyster.ignimgs.com/wordpress/stg.ign.com/2018/04/Guardians-of-the-Galaxy_first_Screenshot-720x404.jpg")
        ),

        Movie(
            "13",
            "Guardians of the Galaxy Vol. 2",
            "137 minutes",
            images = listOf("https://sm.ign.com/t/ign_nl/review/g/guardians-/guardians-of-the-galaxy-vol-2-filmreview_8qke.1200.jpg")
        ),

        Movie(
            "14",
            "Avengers: Age of Ultron",
            "141 minutes",
            images = listOf("https://oyster.ignimgs.com/wordpress/stg.ign.com/2018/04/HEADER_750x450-720x431.jpg")
        ),

        Movie(
            "15",
            "Ant-Man",
            "117 minutes",
            images = listOf("https://images.pathe-thuis.nl/12160_378x538.jpg")
        ),

        Movie(
            "16",
            "Captain America: Civil War",
            "147 minutes",
            images = listOf("https://oyster.ignimgs.com/wordpress/stg.ign.com/2018/04/thumb-1920-696684-720x405.jpg")
        ),

        Movie(
            "17",
            "Black Widow",
            "134 minutes",
            images = listOf("https://lumiere-a.akamaihd.net/v1/images/image_b97b56f3.jpeg?region=0%2C0%2C540%2C810")
        ),

        Movie(
            "18",
            "Black Panther",
            "134 minutes",
            images = listOf("https://oyster.ignimgs.com/wordpress/stg.ign.com/2018/04/tmp_4VQ0su_2edc155807cce782_blackpanther-720x379.jpg")
        ),

        Movie(
            "19",
            "Spider-Man: Homecoming",
            "133 minutes",
            images = listOf("https://images.pathe-thuis.nl/12025_450x640.jpg")
        ),

        Movie(
            "20",
            "Doctor Strange",
            "115 minutes",
            images = listOf("https://oyster.ignimgs.com/wordpress/stg.ign.com/2018/04/doctor-strange-1000x562-720x404.jpg")
        ),

        Movie(
            "21",
            "Thor: Ragnarok",
            "130 minutes",
            images = listOf("https://oyster.ignimgs.com/wordpress/stg.ign.com/2018/04/Thor-Ragnarok-Image-with-Hulk-Valkyire-and-Loki-720x360.jpg")
        ),

        Movie(
            "22",
            "Ant-Man and the Wasp",
            "118 minutes",
            images = listOf("https://images.pathe-thuis.nl/17732_450x640.jpg")
        ),

        Movie(
            "23",
            "Avengers: Infinity War",
            "149 minutes",
            images = listOf("https://assets1.ignimgs.com/2018/12/17/infinitywarthanos-blogroll-1524860342885_1280w1545096956109.jpg")
        ),

        Movie(
            "24",
            "Avengers: Endgame",
            "181 minutes",
            images = listOf("https://assets1.ignimgs.com/2019/12/20/avengersendgame1576859055071.jpg")
        ),

        Movie(
            "25",
            "Loki",
            "6 episodes",
            images = listOf("https://assets-prd.ignimgs.com/2021/07/08/loki-1623100216162-1623261798524-1625753454817.png")
        ),

        Movie(
            "26",
            "WandaVision",
            "9 episodes",
            images =listOf("https://assets-www.npo3.nl/uploads/media_item/media_item/448/49/WandaVision1_widescreen_large-1609322463.jpg")
        ),

        Movie(
            "27",
            "The Falcon and the Winter Soldier",
            "6 episodes",
            images = listOf("https://prod-ripcut-delivery.disney-plus.net/v1/variant/disney/C89246146D8FF4CB13327F054990B8187FE1EDB0A61DE64CD218404683C771F7/scale?width=1200&aspectRatio=1.78&format=jpeg")
        ),

        Movie(
            "28",
            "Spider-Man: Far From Home",
            "129 minutes",
            images = listOf("https://assets-prd.ignimgs.com/2021/01/12/spider-man-main-1280x720-1610481351320.jpg")
        ),

        Movie(
            "29",
            "Shang-Chi and the Legend of the Ten Rings",
            "132 minutes",
            images = listOf("https://lumiere-a.akamaihd.net/v1/images/image_a537b05d.jpeg?region=0%2C0%2C540%2C810")
        ),

        Movie(
            "30",
            "Eternals",
            "157 minutes",
            images = listOf("https://assets-prd.ignimgs.com/2021/10/11/eternals-assemble-1633951034365.png")
        ))
}