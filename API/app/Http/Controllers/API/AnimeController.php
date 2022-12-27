<?php

namespace App\Http\Controllers\API;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use App\Models\Animes;

class AnimeController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        $animes = Animes::all();
        return response()->json([
            'status'=>200,
            'pesan'=>'berhasil',
            'data'=>$animes
        ]);
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
        $animes = new Animes;
        $animes->foto_anime = $request->foto_anime;
        $animes->judul_anime = $request->judul_anime;
        $animes->deskripsi_anime = $request->deskripsi_anime;
        $animes->save();
        return response()->json([
            'status'=>200,
            'pesan'=>'berhasil',
            'data'=>$animes
        ]);
    }

    /**
     * Display the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function show($id)
    {
        $animes = Animes::find($id);
        return response()->json([
            'status'=>200,
            'pesan'=>'berhasil',
            'data'=>$animes
        ]);
    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, $id)
    {
        $animes = Animes::find($id);
        $animes->foto_anime = $request->foto_anime;
        $animes->judul_anime = $request->judul_anime;
        $animes->deskripsi_anime = $request->deskripsi_anime;
        $animes->save();
        return response()->json([
            'status'=>200,
            'pesan'=>'berhasil',
            'data'=>$animes
        ]);
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function destroy($id)
    {
        $animes = Animes::find($id);
        $animes->delete();
        return response()->json([
            'status'=>200,
            'pesan'=>'berhasil',
        ]);
    }
}
