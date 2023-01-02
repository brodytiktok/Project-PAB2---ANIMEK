<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use DB;

class GenreSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        DB::table('genres')->insert([//1
            'nama_genre'=>'Action'
        ]);
        DB::table('genres')->insert([//2
            'nama_genre'=>'Comedy'
        ]);
        DB::table('genres')->insert([//3
            'nama_genre'=>'Adventure'
        ]);
        DB::table('genres')->insert([//4
            'nama_genre'=>'Drama'
        ]);
        DB::table('genres')->insert([//5
            'nama_genre'=>'Fantasy'
        ]);
        DB::table('genres')->insert([//6
            'nama_genre'=>'Sci-Fi'
        ]);
        DB::table('genres')->insert([//7
            'nama_genre'=>'Suspense'
        ]);
        DB::table('genres')->insert([//8
            'nama_genre'=>'Supernatural'
        ]);
        DB::table('genres')->insert([//9
            'nama_genre'=>'Sports'
        ]);
        DB::table('genres')->insert([//10
            'nama_genre'=>'Mystery'
        ]);
        DB::table('genres')->insert([//11
            'nama_genre'=>'Slice of Life'
        ]);
    }
}
