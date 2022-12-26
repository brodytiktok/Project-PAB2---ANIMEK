<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Anime_genres extends Model
{
    use HasFactory;
    protected $table = 'anime_genres';

    function animes(){
        return $this->hasOne(animes::class,'id_anime','id');
    }
    function genres(){
        return $this->hasMany(genres::class,'id_genre','id');
    }

}
