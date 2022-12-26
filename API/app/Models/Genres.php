<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Genres extends Model
{
    use HasFactory;
    protected $table = 'genres';

    public function Anime_genres()
    {
        return $this->belongsTo(Anime_genres::class, 'id', 'id_genre');
    }

}
