<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use DB;

class AnimeSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        DB::table('animes')->insert([ //1
            'foto_anime' => 'https://cdn.myanimelist.net/images/anime/1208/94745.jpg',
            'judul_anime' => 'Fullmetal Alchemist: Brotherhood',
            'deskripsi_anime' => "After a horrific alchemy experiment goes wrong in the Elric household, brothers Edward and Alphonse are left in a catastrophic new reality. Ignoring the alchemical principle banning human transmutation, the boys attempted to bring their recently deceased mother back to life. Instead, they suffered brutal personal loss: Alphonse's body disintegrated while Edward lost a leg and then sacrificed an arm to keep Alphonse's soul in the physical realm by binding it to a hulking suit of armor.
            \n\n
            The brothers are rescued by their neighbor Pinako Rockbell and her granddaughter Winry. Known as a bio-mechanical engineering prodigy, Winry creates prosthetic limbs for Edward by utilizing \"automail,\" a tough, versatile metal used in robots and combat armor. After years of training, the Elric brothers set off on a quest to restore their bodies by locating the Philosopher's Stone—a powerful gem that allows an alchemist to defy the traditional laws of Equivalent Exchange.
            \n\n
            As Edward becomes an infamous alchemist and gains the nickname \"Fullmetal,\" the boys' journey embroils them in a growing conspiracy that threatens the fate of the world.",
        ]);

        DB::table('animes')->insert([ //2
            'foto_anime' => 'https://cdn.myanimelist.net/images/anime/7/72533l.jpg',
            'judul_anime' => 'One Punch Man',
            'deskripsi_anime' => "The seemingly unimpressive Saitama has a rather unique hobby: being a hero. In order to pursue his childhood dream, Saitama relentlessly trained for three years, losing all of his hair in the process. Now, Saitama is so powerful, he can defeat any enemy with just one punch. However, having no one capable of matching his strength has led Saitama to an unexpected problem—he is no longer able to enjoy the thrill of battling and has become quite bored.
            \n\n
            One day, Saitama catches the attention of 19-year-old cyborg Genos, who witnesses his power and wishes to become Saitama's disciple. Genos proposes that the two join the Hero Association in order to become certified heroes that will be recognized for their positive contributions to society. Saitama, who is shocked that no one knows who he is, quickly agrees. Meeting new allies and taking on new foes, Saitama embarks on a new journey as a member of the Hero Association to experience the excitement of battle he once felt.",
        ]);

        DB::table('animes')->insert([
            'foto_anime'=>'https://cdn.myanimelist.net/images/anime/1956/126621l.jpg',
            'judul_anime'=>'Bleach: Sennen Kessen-hen',
            'deskripsi_anime'=>"Substitute Soul Reaper Ichigo Kurosaki spends his days fighting against Hollows, dangerous evil spirits that threaten Karakura Town. Ichigo carries out his quest with his closest allies: Orihime Inoue, his childhood friend with a talent for healing; Yasutora Sado, his high school classmate with superhuman strength; and Uryuu Ishida, Ichigo's Quincy rival.
            \n\n
            Ichigo's vigilante routine is disrupted by the sudden appearance of Asguiaro Ebern, a dangerous Arrancar who heralds the return of Yhwach, an ancient Quincy king. Yhwach seeks to reignite the historic blood feud between Soul Reaper and Quincy, and he sets his sights on erasing both the human world and the Soul Society for good.
            \n\n
            Yhwach launches a two-pronged invasion into both the Soul Society and Hueco Mundo, the home of Hollows and Arrancar. In retaliation, Ichigo and his friends must fight alongside old allies and enemies alike to end Yhwach's campaign of carnage before the world itself comes to an end.",
        ]);

        DB::table('animes')->insert([
            'foto_anime'=>'https://cdn.myanimelist.net/images/anime/5/73199l.jpg',
            'judul_anime'=>'Steins;Gate',
            'deskripsi_anime'=>"Eccentric scientist Rintarou Okabe has a never-ending thirst for scientific exploration. Together with his ditzy but well-meaning friend Mayuri Shiina and his roommate Itaru Hashida, Rintarou founds the Future Gadget Laboratory in the hopes of creating technological innovations that baffle the human psyche. Despite claims of grandeur, the only notable \"gadget\" the trio have created is a microwave that has the mystifying power to turn bananas into green goo.
            \n\n
            However, when Rintarou decides to attend neuroscientist Kurisu Makise's conference on time travel, he experiences a series of strange events that lead him to believe that there is more to the \"Phone Microwave\" gadget than meets the eye. Apparently able to send text messages into the past using the microwave, Rintarou dabbles further with the \"time machine,\" attracting the ire and attention of the mysterious organization SERN.
            \n\n
            Due to the novel discovery, Rintarou and his friends find themselves in an ever-present danger. As he works to mitigate the damage his invention has caused to the timeline, he is not only fighting a battle to save his loved ones, but also one against his degrading sanity.",
        ]);

        DB::table('animes')->insert([
            'foto_anime'=>'https://cdn.myanimelist.net/images/anime/1337/99013l.jpg',
            'judul_anime'=>'Hunter x Hunter (2011)',
            'deskripsi_anime'=>"Hunters devote themselves to accomplishing hazardous tasks, all from traversing the world's uncharted territories to locating rare items and monsters. Before becoming a Hunter, one must pass the Hunter Examination—a high-risk selection process in which most applicants end up handicapped or worse, deceased.
            \n\n
            Ambitious participants who challenge the notorious exam carry their own reason. What drives 12-year-old Gon Freecss is finding Ging, his father and a Hunter himself. Believing that he will meet his father by becoming a Hunter, Gon takes the first step to walk the same path.
            \n\n
            During the Hunter Examination, Gon befriends the medical student Leorio Paladiknight, the vindictive Kurapika, and ex-assassin Killua Zoldyck. While their motives vastly differ from each other, they band together for a common goal and begin to venture into a perilous world.",
        ]);

        DB::table('animes')->insert([
            'foto_anime'=>'https://cdn.myanimelist.net/images/anime/1130/112176.jpg',
            'judul_anime'=>'Bocchi the Rock!',
            'deskripsi_anime'=>"Yearning to make friends and perform live with a band, lonely and socially anxious Hitori \"Bocchi\" Gotou devotes her time to playing the guitar. On a fateful day, Bocchi meets the outgoing drummer Nijika Ijichi, who invites her to join Kessoku Band when their guitarist, Ikuyo Kita, flees before their first show. Soon after, Bocchi meets her final bandmate—the cool bassist Ryou Yamada.
            \n\n
            Although their first performance together is subpar, the girls feel empowered by their shared love for music, and they are soon rejoined by Kita. Finding happiness in performing, Bocchi and her bandmates put their hearts into improving as musicians while making the most of their fleeting high school days.",
        ]);

        DB::table('animes')->insert([
            'foto_anime'=>'https://cdn.myanimelist.net/images/anime/3/80136l.jpg',
            'judul_anime'=>'Koe no Katachi',
            'deskripsi_anime'=>"As a wild youth, elementary school student Shouya Ishida sought to beat boredom in the cruelest ways. When the deaf Shouko Nishimiya transfers into his class, Shouya and the rest of his class thoughtlessly bully her for fun. However, when her mother notifies the school, he is singled out and blamed for everything done to her. With Shouko transferring out of the school, Shouya is left at the mercy of his classmates. He is heartlessly ostracized all throughout elementary and middle school, while teachers turn a blind eye.
            \n\n    
            Now in his third year of high school, Shouya is still plagued by his wrongdoings as a young boy. Sincerely regretting his past actions, he sets out on a journey of redemption: to meet Shouko once more and make amends.
            \n\n
            Koe no Katachi tells the heartwarming tale of Shouya's reunion with Shouko and his honest attempts to redeem himself, all while being continually haunted by the shadows of his past.",
        ]);

        DB::table('animes')->insert([
            'foto_anime'=>'https://cdn.myanimelist.net/images/anime/5/87048.jpg',
            'judul_anime'=>'Kimi no Na wa.',
            'deskripsi_anime'=>"Mitsuha Miyamizu, a high school girl, yearns to live the life of a boy in the bustling city of Tokyo—a dream that stands in stark contrast to her present life in the countryside. Meanwhile in the city, Taki Tachibana lives a busy life as a high school student while juggling his part-time job and hopes for a future in architecture.
            \n\n
            One day, Mitsuha awakens in a room that is not her own and suddenly finds herself living the dream life in Tokyo—but in Taki's body! Elsewhere, Taki finds himself living Mitsuha's life in the humble countryside. In pursuit of an answer to this strange phenomenon, they begin to search for one another.
            \n\n
            Kimi no Na wa. revolves around Mitsuha and Taki's actions, which begin to have a dramatic impact on each other's lives, weaving them into a fabric held together by fate and circumstance.",
        ]);

        DB::table('animes')->insert([
            'foto_anime'=>'https://cdn.myanimelist.net/images/anime/1908/120036.jpg',
            'judul_anime'=>'Kimetsu no Yaiba: Yuukaku-hen',
            'deskripsi_anime'=>"The devastation of the Mugen Train incident still weighs heavily on the members of the Demon Slayer Corps. Despite being given time to recover, life must go on, as the wicked never sleep: a vicious demon is terrorizing the alluring women of the Yoshiwara Entertainment District. The Sound Pillar, Tengen Uzui, and his three wives are on the case. However, when he soon loses contact with his spouses, Tengen fears the worst and enlists the help of Tanjirou Kamado, Zenitsu Agatsuma, and Inosuke Hashibira to infiltrate the district's most prominent houses and locate the depraved Upper Rank demon.",
        ]);

        DB::table('animes')->insert([
            'foto_anime'=>'https://cdn.myanimelist.net/images/anime/1000/110531.jpg',
            'judul_anime'=>'Shingeki no Kyojin: The Final Season',
            'deskripsi_anime'=>"Gabi Braun and Falco Grice have been training their entire lives to inherit one of the seven Titans under Marley's control and aid their nation in eradicating the Eldians on Paradis. However, just as all seems well for the two cadets, their peace is suddenly shaken by the arrival of Eren Yeager and the remaining members of the Survey Corps.
            \n\n
            Having finally reached the Yeager family basement and learned about the dark history surrounding the Titans, the Survey Corps has at long last found the answer they so desperately fought to uncover. With the truth now in their hands, the group set out for the world beyond the walls.
            \n\n
            In Shingeki no Kyojin: The Final Season, two utterly different worlds collide as each party pursues its own agenda in the long-awaited conclusion to Paradis' fight for freedom.",
        ]);

        DB::table('animes')->insert([
            'foto_anime'=>'https://cdn.myanimelist.net/images/anime/7/81992.jpg',
            'judul_anime'=>'Haikyuu!! Karasuno Koukou vs. Shiratorizawa Gakuen Koukou',
            'deskripsi_anime'=>"After the victory against Aoba Jousai High, Karasuno High School, once called “a fallen powerhouse, a crow that can’t fly,” has finally reached the climax of the heated Spring tournament. Now, to advance to nationals, the Karasuno team has to defeat the powerhouse Shiratorizawa Academy. Karasuno’s greatest hurdle is their adversary’s ace, Wakatoshi Ushijima, the number one player in the Miyagi Prefecture, and one of the country’s top three aces.
            \n\n
            Only the strongest team will make it to the national tournament. Since this match is the third-year players’ last chance to qualify for nationals, Karasuno has to use everything they learned during the training camp and prior matches to attain victory. Filled with restlessness and excitement, both teams are determined to come out on top in the third season of Haikyuu!!.
            ",
        ]);

        DB::table('animes')->insert([
            'foto_anime'=>'https://cdn.myanimelist.net/images/anime/6/79597.jpg',
            'judul_anime'=>'Sen to Chihiro no Kamikakushi',
            'deskripsi_anime'=>"Stubborn, spoiled, and naïve, 10-year-old Chihiro Ogino is less than pleased when she and her parents discover an abandoned amusement park on the way to their new house. Cautiously venturing inside, she realizes that there is more to this place than meets the eye, as strange things begin to happen once dusk falls. Ghostly apparitions and food that turns her parents into pigs are just the start—Chihiro has unwittingly crossed over into the spirit world. Now trapped, she must summon the courage to live and work amongst spirits, with the help of the enigmatic Haku and the cast of unique characters she meets along the way.
            \n\n
            Vivid and intriguing, Sen to Chihiro no Kamikakushi tells the story of Chihiro's journey through an unfamiliar world as she strives to save her parents and return home.",
        ]);

        DB::table('animes')->insert([
            'foto_anime'=>'https://cdn.myanimelist.net/images/anime/1233/128920.jpg',
            'judul_anime'=>'JoJo no Kimyou na Bouken Part 6: Stone Ocean Part 3',
            'deskripsi_anime'=>"Conspiring forces frame Jolyne Kuujou for a reckless crime, landing her in the infamous Green Dolphin Street Jail. Much like her father Joutarou, Jolyne is brash, brave, and just; she rails against her unfair sentence and quickly discovers the sinister circumstances that led to her incarceration.
            \n\n
            A gift from her absent father grants Jolyne the power of Stone Free, a supernatural ability known as a Stand that allows her to unravel her body into string. Jolyne uses Stone Free to battle her way through the prison, recruiting new allies—Ermes Costello and Foo Fighters—to assist in her investigation. Together, the fearless women fight to uncover the menace behind Whitesnake, an enemy Stand responsible for the increasingly dangerous prisoners who are after Jolyne's life.
            \n\n
            Through Jolyne, the Joestar lineage confronts the legacy of its one true enemy. Jolyne and her friends race to stop a disastrous plot and put an end to a culminating evil.",
        ]);

        DB::table('animes')->insert([
            'foto_anime'=>'https://cdn.myanimelist.net/images/anime/1806/126216.jpg',
            'judul_anime'=>'Chainsaw Man',
            'deskripsi_anime'=>"Denji is robbed of a normal teenage life, left with nothing but his deadbeat father's overwhelming debt. His only companion is his pet, the chainsaw devil Pochita, with whom he slays devils for money that inevitably ends up in the yakuza's pockets. All Denji can do is dream of a good, simple life: one with delicious food and a beautiful girlfriend by his side. But an act of greedy betrayal by the yakuza leads to Denji's brutal, untimely death, crushing all hope of him ever achieving happiness.
            \n\n
            Remarkably, an old contract allows Pochita to merge with the deceased Denji and bestow devil powers on him, changing him into a hybrid able to transform his body parts into chainsaws. Because Denji's new abilities pose a significant risk to society, the Public Safety Bureau's elite devil hunter Makima takes him in, letting him live as long as he obeys her command. Guided by the promise of a content life alongside an attractive woman, Denji devotes everything and fights with all his might to make his naive dreams a reality.",
        ]);

        DB::table('animes')->insert([
            'foto_anime'=>'https://cdn.myanimelist.net/images/anime/4/19644.jpg',
            'judul_anime'=>'Cowboy Bebop',
            'deskripsi_anime'=>"Crime is timeless. By the year 2071, humanity has expanded across the galaxy, filling the surface of other planets with settlements like those on Earth. These new societies are plagued by murder, drug use, and theft, and intergalactic outlaws are hunted by a growing number of tough bounty hunters.
            \n\n
            Spike Spiegel and Jet Black pursue criminals throughout space to make a humble living. Beneath his goofy and aloof demeanor, Spike is haunted by the weight of his violent past. Meanwhile, Jet manages his own troubled memories while taking care of Spike and the Bebop, their ship. The duo is joined by the beautiful con artist Faye Valentine, odd child Edward Wong Hau Pepelu Tivrusky IV, and Ein, a bioengineered Welsh Corgi.
            \n\n
            While developing bonds and working to catch a colorful cast of criminals, the Bebop crew's lives are disrupted by a menace from Spike's past. As a rival's maniacal plot continues to unravel, Spike must choose between life with his newfound family or revenge for his old wounds.",
        ]);

        DB::table('animes')->insert([
            'foto_anime'=>'https://cdn.myanimelist.net/images/anime/4/86334.jpg',
            'judul_anime'=>'Hajime no Ippo',
            'deskripsi_anime'=>"In his father's absence, teenager Ippo Makunouchi works hard to help his mother run her fishing boat rental business. Ippo's timid nature, his lack of sleep, and the sea smell make him an easy target for relentless bullies who leave him bruised and beaten on a daily basis. Mamoru Takamura, an up-and-coming boxer, rescues Ippo from a violent after-school incident and takes him back to the Kamogawa Boxing Gym for recovery. Takamura and his fellow boxers, Masaru Aoki and Tatsuya Kimura, are stunned by Ippo's powerful punches—a result of strong muscles developed through years serving his physically taxing family business.
            \n\n
            Following brief training under Takamura, Ippo impresses the other boxers in a practice match against prodigy Ichirou Miyata. He gains a rival in Miyata and a coach in Genji Kamogawa, the gym owner and a former boxer himself. As Ippo takes the first steps in his official boxing career, he faces off against a series of challenging opponents, each more powerful than the last. Victory, loss, and a cycle of dedicated training await Ippo on his journey to achieve greatness. With his tough body and unstoppable fighting spirit, the kind young man seeks to take on the world.",
        ]);

        DB::table('animes')->insert([
            'foto_anime'=>'https://cdn.myanimelist.net/images/anime/1500/103005.jpg',
            'judul_anime'=>'Vinland Saga',
            'deskripsi_anime'=>"Young Thorfinn grew up listening to the stories of old sailors that had traveled the ocean and reached the place of legend, Vinland. It's said to be warm and fertile, a place where there would be no need for fighting—not at all like the frozen village in Iceland where he was born, and certainly not like his current life as a mercenary. War is his home now. Though his father once told him, \"You have no enemies, nobody does. There is nobody who it's okay to hurt,\" as he grew, Thorfinn knew that nothing was further from the truth.
            \n\n
            The war between England and the Danes grows worse with each passing year. Death has become commonplace, and the viking mercenaries are loving every moment of it. Allying with either side will cause a massive swing in the balance of power, and the vikings are happy to make names for themselves and take any spoils they earn along the way. Among the chaos, Thorfinn must take his revenge and kill Askeladd, the man who murdered his father. The only paradise for the vikings, it seems, is the era of war and death that rages on.",
        ]);

        DB::table('animes')->insert([
            'foto_anime'=>'https://cdn.myanimelist.net/images/anime/1493/124765.jpg',
            'judul_anime'=>'Shouwa Genroku Rakugo Shinjuu: Sukeroku Futatabi-hen',
            'deskripsi_anime'=>"Even after having risen to the utmost rank of shin'uchi, Yotarou struggles to find his own identity in the world of rakugo. Caught between his master's teachings and the late Sukeroku's unique style, his performance lacks an important ingredient—ego. And while his popularity packs the theaters, he is but one of the few; rakugo is under threat of being eclipsed.
            \n\n
            Meanwhile Yakumo, regarded by many as the last bastion of preserving the popularity of rakugo, struggles to cope with his elderly state. Even though his performances are still stellar, he fears that he is nearing his limits. His doubts grow stronger as an old friend creeps ever closer. Konatsu, for her part, attempts to raise her son as a single mother, which Yotarou is heavily opposed to. Instead, he seeks to persuade her to marry him and in turn raise her son as his own.
            \n\n
            In Shouwa Genroku Rakugo Shinjuu: Sukeroku Futatabi-hen, the curtains fall on Yotarou and Yakumo's story, tasked with restoring the near-obsolete art form as well as overcoming their internal conflicts.",
        ]);

        DB::table('animes')->insert([
            'foto_anime'=>'https://cdn.myanimelist.net/images/anime/3/45028.jpg',
            'judul_anime'=>'Ashita no Joe 2',
            'deskripsi_anime'=>"Yabuki Joe is left downhearted and hopeless after a certain tragic event. In attempt to put the past behind him, Joe leaves the gym behind and begins wandering. On his travels he comes across the likes of Wolf Kanagushi and Goromaki Gondo, men who unintentionally fan the dying embers inside him, leading him to putting his wanderings to an end. His return home puts Joe back on the path to boxing, but unknown to himself and his trainer, he now suffers deep-set issues holding him back from fighting. In attempt to quell those issues, Carlos Rivera, a world renowned boxer is invited from Venezuela to help Joe recover.",
        ]);

        DB::table('animes')->insert([
            'foto_anime'=>'https://cdn.myanimelist.net/images/anime/1981/113348.jpg',
            'judul_anime'=>'Odd Taxi',
            'deskripsi_anime'=>"Eccentric and blunt, the walrus Hiroshi Odokawa lives a relatively normal life. He drives a taxi for a living, and there he meets several unique individuals: the jobless Taichi Kabasawa who is dead-set on going viral, the mysterious nurse Miho Shirakawa, the struggling comedic duo \"Homo Sapiens,\" and Dobu, a well-known delinquent.
            \n\n
            But Odokawa's simple way of life is about to be turned upside-down. The case of a missing girl the police have been tracking leads back to him, and now both the yakuza and a duo of corrupt cops are on his tail. Set in a strangely familiar city filled with unusual individuals, Odd Taxi is a bizarre story about a humble taxi driver and the mystery of a lost high schooler.",
        ]);

        DB::table('animes')->insert([
            'foto_anime'=>'https://cdn.myanimelist.net/images/anime/1441/122795.jpg',
            'judul_anime'=>'Spy x Family',
            'deskripsi_anime'=>"Corrupt politicians, frenzied nationalists, and other warmongering forces constantly jeopardize the thin veneer of peace between neighboring countries Ostania and Westalis. In spite of their plots, renowned spy and master of disguise \"Twilight\" fulfills dangerous missions one after another in the hope that no child will have to experience the horrors of war.
            \n\n
            In the bustling Ostanian city of Berlint, Twilight dons the alias of \"Loid Forger,\" an esteemed psychiatrist. However, his true intention is to gather intelligence on prominent politician Donovan Desmond, who only appears rarely in public at his sons' school: the prestigious Eden Academy. Enlisting the help of unmarried city hall clerk Yor Briar to act as his wife and adopting the curious six-year-old orphan Anya as his daughter, Loid enacts his master plan. He will enroll Anya in Eden Academy, where Loid hopes she will excel and give him the opportunity to meet Donovan without arousing suspicion.
            \n\n
            Unfortunately for Loid, even a man of his talents has trouble playing the figure of a loving father and husband. And just like Loid is hiding his true identity, Yor—who is an underground assassin known as \"Thorn Princess\"—and Anya—an esper who can read people's minds—have no plans to disclose their own secrets either. Although this picture-perfect family is founded on deception, the Forgers gradually come to understand that the love they share for one another trumps all else.",
        ]);

        DB::table('animes')->insert([
            'foto_anime'=>'https://cdn.myanimelist.net/images/anime/13/11460.jpg',
            'judul_anime'=>'Great Teacher Onizuka',
            'deskripsi_anime'=>"Twenty-two-year-old Eikichi Onizuka—ex-biker gang leader, conqueror of Shonan, and virgin—has a dream: to become the greatest high school teacher in all of Japan. This isn't because of a passion for teaching, but because he wants a loving teenage wife when he's old and gray. Still, for a perverted, greedy, and lazy delinquent, there is more to Onizuka than meets the eye. So when he lands a job as the homeroom teacher of the Class 3-4 at the prestigious Holy Forest Academy—despite suplexing the Vice Principal—all of his talents are put to the test, as this class is particularly infamous.
            \n\n
            Due to their utter contempt for all teachers, the class' students use psychological warfare to mentally break any new homeroom teacher they get, forcing them to quit and leave school. However, Onizuka isn't your average teacher, and he's ready for any challenge in his way.
            \n\n
            Bullying, suicide, and sexual harassment are just a few of the issues his students face daily. By tackling the roots of their problems, Onizuka supports them with his unpredictable and unconventional methods—even if it means jumping off a building to save a suicidal child. Thanks to his eccentric charm and fun-loving nature, Class 3-4 slowly learns just how enjoyable school can be when you're the pupils of the Great Teacher Onizuka.",
        ]);

        DB::table('animes')->insert([
            'foto_anime'=>'https://cdn.myanimelist.net/images/anime/6/73245.jpg',
            'judul_anime'=>'One Piece',
            'deskripsi_anime'=>"Gol D. Roger was known as the \"Pirate King,\" the strongest and most infamous being to have sailed the Grand Line. The capture and execution of Roger by the World Government brought a change throughout the world. His last words before his death revealed the existence of the greatest treasure in the world, One Piece. It was this revelation that brought about the Grand Age of Pirates, men who dreamed of finding One Piece—which promises an unlimited amount of riches and fame—and quite possibly the pinnacle of glory and the title of the Pirate King.
            \n\n
            Enter Monkey D. Luffy, a 17-year-old boy who defies your standard definition of a pirate. Rather than the popular persona of a wicked, hardened, toothless pirate ransacking villages for fun, Luffy's reason for being a pirate is one of pure wonder: the thought of an exciting adventure that leads him to intriguing people and ultimately, the promised treasure. Following in the footsteps of his childhood hero, Luffy and his crew travel across the Grand Line, experiencing crazy adventures, unveiling dark mysteries and battling strong enemies, all in order to reach the most coveted of all fortunes—One Piece.",
        ]);

        DB::table('animes')->insert([
            'foto_anime'=>'https://cdn.myanimelist.net/images/anime/6/86733.jpg',
            'judul_anime'=>'Made in Abyss',
            'deskripsi_anime'=>"The Abyss—a gaping chasm stretching down into the depths of the earth, filled with mysterious creatures and relics from a time long past. How did it come to be? What lies at the bottom? Countless brave individuals, known as Divers, have sought to solve these mysteries of the Abyss, fearlessly descending into its darkest realms. The best and bravest of the Divers, the White Whistles, are hailed as legends by those who remain on the surface.
            \n\n
            Riko, daughter of the missing White Whistle Lyza the Annihilator, aspires to become like her mother and explore the furthest reaches of the Abyss. However, just a novice Red Whistle herself, she is only permitted to roam its most upper layer. Even so, Riko has a chance encounter with a mysterious robot with the appearance of an ordinary young boy. She comes to name him Reg, and he has no recollection of the events preceding his discovery. Certain that the technology to create Reg must come from deep within the Abyss, the two decide to venture forth into the chasm to recover his memories and see the bottom of the great pit with their own eyes. However, they know not of the harsh reality that is the true existence of the Abyss.",
        ]);

        DB::table('animes')->insert([
            'foto_anime'=>'https://cdn.myanimelist.net/images/anime/2/73862.jpg',
            'judul_anime'=>'Mushishi',
            'deskripsi_anime'=>"\"Mushi\": the most basic forms of life in the world. They exist without any goals or purposes aside from simply \"being.\" They are beyond the shackles of the words \"good\" and \"evil.\" Mushi can exist in countless forms and are capable of mimicking things from the natural world such as plants, diseases, and even phenomena like rainbows.
            \n\n
            This is, however, just a vague definition of these entities that inhabit the vibrant world of Mushishi, as to even call them a form of life would be an oversimplification. Detailed information on Mushi is scarce because the majority of humans are unaware of their existence.
            \n\n
            So what are Mushi and why do they exist? This is the question that a \"Mushishi,\" Ginko, ponders constantly. Mushishi are those who research Mushi in hopes of understanding their place in the world's hierarchy of life.
            \n\n
            Ginko chases rumors of occurrences that could be tied to Mushi, all for the sake of finding an answer.
            \n\n
            It could, after all, lead to the meaning of life itself.",
        ]);

        DB::table('animes')->insert([
            'foto_anime'=>'https://cdn.myanimelist.net/images/anime/8/56617.jpg',
            'judul_anime'=>'Hajime no Ippo: New Challenger',
            'deskripsi_anime'=>"Japanese Featherweight Champion Ippo Makunouchi has successfully defended and retained his title. Meanwhile, his rival, Ichirou Miyata, has resurfaced in Japan, aiming for his own Featherweight belt in the Oriental Pacific Boxing Federation. When the rest of the world comes knocking, however, will Japan's best fighters rise to the challenge and achieve glory at the top? Or will the small island nation be crushed under the weight of greater entities? This time, champions will become challengers issuing a call to the rest of the world and ready to show off their fighting spirit!",
        ]);

        DB::table('animes')->insert([
            'foto_anime'=>'https://cdn.myanimelist.net/images/anime/1171/109222.jpg',
            'judul_anime'=>'Jujutsu Kaisen',
            'deskripsi_anime'=>"Idly indulging in baseless paranormal activities with the Occult Club, high schooler Yuuji Itadori spends his days at either the clubroom or the hospital, where he visits his bedridden grandfather. However, this leisurely lifestyle soon takes a turn for the strange when he unknowingly encounters a cursed item. Triggering a chain of supernatural occurrences, Yuuji finds himself suddenly thrust into the world of Curses—dreadful beings formed from human malice and negativity—after swallowing the said item, revealed to be a finger belonging to the demon Sukuna Ryoumen, the \"King of Curses.\"
            \n\n
            Yuuji experiences first-hand the threat these Curses pose to society as he discovers his own newfound powers. Introduced to the Tokyo Metropolitan Jujutsu Technical High School, he begins to walk down a path from which he cannot return—the path of a Jujutsu sorcerer.",
        ]);
    }
}