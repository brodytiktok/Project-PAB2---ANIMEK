<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Characters extends Model
{
    use HasFactory;
    protected $table = 'characters';

    function seiyuus(){
        return $this->hasOne(seiyuus::class,'id_seiyuu','id');
    }
}
