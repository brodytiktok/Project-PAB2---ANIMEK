<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use DB;

class CharacterSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        DB::table('characters')->insert([//1
            'id_anime'=>1,
            'id_seiyuu'=>1,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/9/72533.jpg',
            'nama_character'=>'Edward Elric',
        ]);
        DB::table('characters')->insert([//2
            'id_anime'=>1,
            'id_seiyuu'=>2,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/5/54265.jpg',
            'nama_character'=>'Alphonse Elric',
        ]);
        DB::table('characters')->insert([//3
            'id_anime'=>1,
            'id_seiyuu'=>3,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/7/72983.jpg',
            'nama_character'=>'Roy Mustang',
        ]);
        DB::table('characters')->insert([//4
            'id_anime'=>2,
            'id_seiyuu'=>4,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/11/294388.jpg',
            'nama_character'=>'Saitama',
        ]);
        DB::table('characters')->insert([//5
            'id_anime'=>2,
            'id_seiyuu'=>5,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/9/297329.jpg',
            'nama_character'=>'Genos',
        ]);
        DB::table('characters')->insert([//6
            'id_anime'=>2,
            'id_seiyuu'=>6,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/9/381817.jpg',
            'nama_character'=>'Garou',
        ]);
        DB::table('characters')->insert([//7
            'id_anime'=>3,
            'id_seiyuu'=>7,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/3/89190.jpg',
            'nama_character'=>'Ichigo Kurosaki',
        ]);
        DB::table('characters')->insert([//8
            'id_anime'=>3,
            'id_seiyuu'=>8,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/2/78215.jpg',
            'nama_character'=>'Rukia Kuchiki',
        ]);
        DB::table('characters')->insert([//9
            'id_anime'=>3,
            'id_seiyuu'=>9,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/15/495573.jpg',
            'nama_character'=>'Orihime Inoue',
        ]);
        DB::table('characters')->insert([//10
            'id_anime'=>4,
            'id_seiyuu'=>10,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/6/122643.jpg',
            'nama_character'=>'Rintarou Okabe',
        ]);
        DB::table('characters')->insert([//11
            'id_anime'=>4,
            'id_seiyuu'=>11,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/12/492885.jpg',
            'nama_character'=>'Kurisu Makise',
        ]);
        DB::table('characters')->insert([//12
            'id_anime'=>4,
            'id_seiyuu'=>12,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/4/131329.jpg',
            'nama_character'=>'Mayuri Shiina',
        ]);
        DB::table('characters')->insert([//13
            'id_anime'=>5,
            'id_seiyuu'=>15,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/11/174517.jpg',
            'nama_character'=>'Gon Freecss',
        ]);
        DB::table('characters')->insert([//14
            'id_anime'=>5,
            'id_seiyuu'=>13,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/2/327920.jpg',
            'nama_character'=>'Killua Zoldyck',
        ]);
        DB::table('characters')->insert([//15
            'id_anime'=>5,
            'id_seiyuu'=>14,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/4/174563.jpg',
            'nama_character'=>'Kurapika',
        ]);
        DB::table('characters')->insert([//16
            'id_anime'=>6,
            'id_seiyuu'=>16,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/8/491455.jpg',
            'nama_character'=>'Hitori Gotou',
        ]);
        DB::table('characters')->insert([//17
            'id_anime'=>6,
            'id_seiyuu'=>17,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/16/491303.jpg',
            'nama_character'=>'Ryou Yamada',
        ]);
        DB::table('characters')->insert([//18
            'id_anime'=>6,
            'id_seiyuu'=>18,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/16/491305.jpg',
            'nama_character'=>'Nijika Ijichi',
        ]);
        DB::table('characters')->insert([//19
            'id_anime'=>7,
            'id_seiyuu'=>31,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/8/302316.jpg',
            'nama_character'=>'Shouya Ishida',
        ]);
        DB::table('characters')->insert([//20
            'id_anime'=>7,
            'id_seiyuu'=>19,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/5/302315.jpg',
            'nama_character'=>'Shouko Nishimiya',
        ]);
        DB::table('characters')->insert([//21
            'id_anime'=>7,
            'id_seiyuu'=>20,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/10/330472.jpg',
            'nama_character'=>'Yuzuru Nishimiya',
        ]);
        DB::table('characters')->insert([//22
            'id_anime'=>8,
            'id_seiyuu'=>21,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/5/336342.jpg',
            'nama_character'=>'Mitsuha Miyamizu',
        ]);
        DB::table('characters')->insert([//23
            'id_anime'=>8,
            'id_seiyuu'=>22,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/6/311593.jpg',
            'nama_character'=>'Taki Tachibana',
        ]);
        DB::table('characters')->insert([//24
            'id_anime'=>8,
            'id_seiyuu'=>12,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/6/209419.jpg',
            'nama_character'=>'Yukari Yukino',
        ]);
        DB::table('characters')->insert([//25
            'id_anime'=>9,
            'id_seiyuu'=>23,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/6/386735.jpg',
            'nama_character'=>'Tanjirou Kamado',
        ]);
        DB::table('characters')->insert([//26
            'id_anime'=>9,
            'id_seiyuu'=>24,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/6/384253.jpg',
            'nama_character'=>'Zenitsu Agatsuma',
        ]);
        DB::table('characters')->insert([//27
            'id_anime'=>9,
            'id_seiyuu'=>25,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/3/329560.jpg',
            'nama_character'=>'Inosuke Hashibira',
        ]);
        DB::table('characters')->insert([//28
            'id_anime'=>10,
            'id_seiyuu'=>26,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/10/216895.jpg',
            'nama_character'=>'Eren Yeager',
        ]);
        DB::table('characters')->insert([//29
            'id_anime'=>10,
            'id_seiyuu'=>27,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/9/215563.jpg',
            'nama_character'=>'Mikasa Ackerman',
        ]);
        DB::table('characters')->insert([//30
            'id_anime'=>10,
            'id_seiyuu'=>28,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/2/241413.jpg',
            'nama_character'=>'Levi',
        ]);
        DB::table('characters')->insert([//31
            'id_anime'=>11,
            'id_seiyuu'=>29,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/11/243919.jpg',
            'nama_character'=>'Shouyou Hinata',
        ]);
        DB::table('characters')->insert([//32
            'id_anime'=>11,
            'id_seiyuu'=>5,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/13/417874.jpg',
            'nama_character'=>'Tobio Kageyama',
        ]);
        DB::table('characters')->insert([//33
            'id_anime'=>11,
            'id_seiyuu'=>30,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/14/417859.jpg',
            'nama_character'=>'Kei Tsukishima',
        ]);
        DB::table('characters')->insert([//34
            'id_anime'=>12,
            'id_seiyuu'=>32,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/7/434512.jpg',
            'nama_character'=>'Chihiro Ogino',
        ]);
        DB::table('characters')->insert([//35
            'id_anime'=>12,
            'id_seiyuu'=>31,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/16/480331.jpg',
            'nama_character'=>'Haku',
        ]);
        DB::table('characters')->insert([//36
            'id_anime'=>12,
            'id_seiyuu'=>33,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/16/64987.jpg',
            'nama_character'=>'Kaonashi',
        ]);
        DB::table('characters')->insert([//37
            'id_anime'=>13,
            'id_seiyuu'=>34,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/9/312302.jpg',
            'nama_character'=>'Joutarou Kuujou',
        ]);
        DB::table('characters')->insert([//38
            'id_anime'=>13,
            'id_seiyuu'=>35,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/8/476401.jpg',
            'nama_character'=>'Jolyne Kuujou',
        ]);
        DB::table('characters')->insert([//39
            'id_anime'=>13,
            'id_seiyuu'=>36,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/8/390366.jpg',
            'nama_character'=>'Enrico Pucci',
        ]);
        DB::table('characters')->insert([//40
            'id_anime'=>14,
            'id_seiyuu'=>37,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/4/489561.jpg',
            'nama_character'=>'Makima',
        ]);
        DB::table('characters')->insert([//41
            'id_anime'=>14,
            'id_seiyuu'=>35,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/7/494969.jpg',
            'nama_character'=>'Power',
        ]);
        DB::table('characters')->insert([//42
            'id_anime'=>14,
            'id_seiyuu'=>38,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/3/492407.jpg',
            'nama_character'=>'Denji',
        ]);
        DB::table('characters')->insert([//43
            'id_anime'=>15,
            'id_seiyuu'=>39,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/4/50197.jpg',
            'nama_character'=>'Spike Spiegel',
        ]);
        DB::table('characters')->insert([//44
            'id_anime'=>15,
            'id_seiyuu'=>40,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/15/264961.jpg',
            'nama_character'=>'Faye Valentine',
        ]);
        DB::table('characters')->insert([//45
            'id_anime'=>15,
            'id_seiyuu'=>41,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/16/30533.jpg',
            'nama_character'=>'Edward Wong Hau Pepelu Tivrusky IV',
        ]);
        DB::table('characters')->insert([//46
            'id_anime'=>16,
            'id_seiyuu'=>42,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/11/32678.jpg',
            'nama_character'=>'Ippo Makunouchi',
        ]);
        DB::table('characters')->insert([//47
            'id_anime'=>16,
            'id_seiyuu'=>43,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/13/229037.jpg',
            'nama_character'=>'Mamoru Takamura',
        ]);
        DB::table('characters')->insert([//48
            'id_anime'=>16,
            'id_seiyuu'=>45,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/12/145319.jpg',
            'nama_character'=>'Masaru Aoki',
        ]);
        DB::table('characters')->insert([//49
            'id_anime'=>17,
            'id_seiyuu'=>45,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/14/401940.jpg',
            'nama_character'=>'Askeladd',
        ]);
        DB::table('characters')->insert([//50
            'id_anime'=>17,
            'id_seiyuu'=>46,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/9/309871.jpg',
            'nama_character'=>'Thorfinn',
        ]);
        DB::table('characters')->insert([//51
            'id_anime'=>17,
            'id_seiyuu'=>47,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/2/395761.jpg',
            'nama_character'=>'Canute',
        ]);
        DB::table('characters')->insert([//52
            'id_anime'=>18,
            'id_seiyuu'=>48,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/6/348746.jpg',
            'nama_character'=>'Yakumo Yuurakutei',
        ]);
        DB::table('characters')->insert([//53
            'id_anime'=>18,
            'id_seiyuu'=>36,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/12/276152.jpg',
            'nama_character'=>'Yotarou',
        ]);
        DB::table('characters')->insert([//54
            'id_anime'=>18,
            'id_seiyuu'=>39,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/6/301594.jpg',
            'nama_character'=>'Sukeroku Yuurakutei',
        ]);
        DB::table('characters')->insert([//55
            'id_anime'=>19,
            'id_seiyuu'=>49,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/9/328207.jpg',
            'nama_character'=>'Joe Yabuki',
        ]);
        DB::table('characters')->insert([//56
            'id_anime'=>19,
            'id_seiyuu'=>50,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/4/126741.jpg',
            'nama_character'=>'Danpei Tange',
        ]);
        DB::table('characters')->insert([//57
            'id_anime'=>19,
            'id_seiyuu'=>51,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/5/264537.jpg',
            'nama_character'=>'Yoko Shiraki',
        ]);
        DB::table('characters')->insert([//58
            'id_anime'=>20,
            'id_seiyuu'=>23,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/7/429765.jpg',
            'nama_character'=>'Hiroshi Odokawa',
        ]);
        DB::table('characters')->insert([//59
            'id_anime'=>20,
            'id_seiyuu'=>52,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/15/429792.jpg',
            'nama_character'=>'Yano',
        ]);
        DB::table('characters')->insert([//60
            'id_anime'=>20,
            'id_seiyuu'=>53,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/15/429790.jpg',
            'nama_character'=>'Hajime Tanaka',
        ]);
        DB::table('characters')->insert([//61
            'id_anime'=>21,
            'id_seiyuu'=>54,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/4/457933.jpg',
            'nama_character'=>'Anya Forger',
        ]);
        DB::table('characters')->insert([//62
            'id_anime'=>21,
            'id_seiyuu'=>19,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/11/457934.jpg',
            'nama_character'=>'Yor Forger',
        ]);
        DB::table('characters')->insert([//63
            'id_anime'=>21,
            'id_seiyuu'=>55,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/2/457747.jpg',
            'nama_character'=>'Loid Forger',
        ]);
        DB::table('characters')->insert([//64
            'id_anime'=>22,
            'id_seiyuu'=>44,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/8/241475.jpg',
            'nama_character'=>'Eikichi Onizuka',
        ]);
        DB::table('characters')->insert([//65
            'id_anime'=>22,
            'id_seiyuu'=>56,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/15/113918.jpg',
            'nama_character'=>'Urumi Kanzaki',
        ]);
        DB::table('characters')->insert([//66
            'id_anime'=>22,
            'id_seiyuu'=>57,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/5/51230.jpg',
            'nama_character'=>'Hiroshi Uchiyamada',
        ]);
        DB::table('characters')->insert([//67
            'id_anime'=>23,
            'id_seiyuu'=>58,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/9/310307.jpg',
            'nama_character'=>'Luffy Monkey D.',
        ]);
        DB::table('characters')->insert([//68
            'id_anime'=>23,
            'id_seiyuu'=>59,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/3/100534.jpg',
            'nama_character'=>'Zoro Roronoa',
        ]);
        DB::table('characters')->insert([//69
            'id_anime'=>23,
            'id_seiyuu'=>60,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/5/136769.jpg',
            'nama_character'=>'Sanji',
        ]);
        DB::table('characters')->insert([//70
            'id_anime'=>24,
            'id_seiyuu'=>13,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/4/326001.jpg',
            'nama_character'=>'Reg',
        ]);
        DB::table('characters')->insert([//71
            'id_anime'=>24,
            'id_seiyuu'=>61,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/4/326000.jpg',
            'nama_character'=>'Riko',
        ]);
        DB::table('characters')->insert([//72
            'id_anime'=>24,
            'id_seiyuu'=>62,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/10/350283.jpg',
            'nama_character'=>'Nanachi',
        ]);
        DB::table('characters')->insert([//73
            'id_anime'=>25,
            'id_seiyuu'=>63,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/14/303453.jpg',
            'nama_character'=>'Ginko',
        ]);
        DB::table('characters')->insert([//74
            'id_anime'=>25,
            'id_seiyuu'=>64,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/14/249719.jpg',
            'nama_character'=>'Tanyuu Karibusa',
        ]);
        DB::table('characters')->insert([//75
            'id_anime'=>25,
            'id_seiyuu'=>65,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/16/58434.jpg',
            'nama_character'=>'Nui',
        ]);
        DB::table('characters')->insert([//76
            'id_anime'=>26,
            'id_seiyuu'=>66,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/15/422168.jpg',
            'nama_character'=>'Satoru Gojou',
        ]);
        DB::table('characters')->insert([//77
            'id_anime'=>26,
            'id_seiyuu'=>67,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/11/427601.jpg',
            'nama_character'=>'Yuuji Itadori',
        ]);
        DB::table('characters')->insert([//78
            'id_anime'=>26,
            'id_seiyuu'=>68,
            'foto_character'=>'https://cdn.myanimelist.net/images/characters/6/431152.jpg',
            'nama_character'=>'Sukuna Ryoumen',
        ]);
    }
}
