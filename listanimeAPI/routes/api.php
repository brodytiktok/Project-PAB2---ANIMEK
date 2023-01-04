<?php

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;
use App\Http\Controllers\API\AnimeController;
use App\Http\Controllers\API\AnimeGenreController;
use App\Http\Controllers\API\CharacterController;
use App\Http\Controllers\API\GenreController;
use App\Http\Controllers\API\SeiyuuController;


/*
|--------------------------------------------------------------------------
| API Routes
|--------------------------------------------------------------------------
|
| Here is where you can register API routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| is assigned the "api" middleware group. Enjoy building your API!
|
*/

Route::middleware('auth:sanctum')->get('/user', function (Request $request) {
    return $request->user();
});

Route::get('anime', [AnimeController::class,'index']);
Route::get('anime/{id}', [AnimeController::class,'show']);
Route::post('anime', [AnimeController::class,'store']);
Route::post('anime/{id}/update', [AnimeController::class,'update']);
Route::get('anime/{id}/delete', [AnimeController::class,'destroy']);

Route::get('genre', [GenreController::class,'index']);
Route::get('genre/{id}', [GenreController::class,'show']);
Route::post('genre', [GenreController::class,'store']);
Route::post('genre/{id}/update', [GenreController::class,'update']);
Route::get('genre/{id}/delete', [GenreController::class,'destroy']);

Route::get('seiyuu', [SeiyuuController::class,'index']);
Route::get('seiyuu/{id}', [SeiyuuController::class,'show']);
Route::post('seiyuu', [SeiyuuController::class,'store']);
Route::post('seiyuu/{id}/update', [SeiyuuController::class,'update']);
Route::get('seiyuu/{id}/delete', [SeiyuuController::class,'destroy']);

Route::get('character', [CharacterController::class,'index']);
Route::get('character/{id}', [CharacterController::class,'show']);
Route::post('character', [CharacterController::class,'store']);
Route::post('character/{id}/update', [CharacterController::class,'update']);
Route::get('character/{id}/delete', [CharacterController::class,'destroy']);

Route::get('animegenre', [AnimeGenreController::class,'index']);
Route::get('animegenre/{id}', [AnimeGenreController::class,'show']);
Route::post('animegenre', [AnimeGenreController::class,'store']);
Route::post('animegenre/{id}/update', [AnimeGenreController::class,'update']);
Route::get('animegenre/{id}/delete', [AnimeGenreController::class,'destroy']);
