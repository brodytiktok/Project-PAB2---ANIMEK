<?php

namespace App\Http\Controllers\API;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use App\Models\Genres;

class GenreController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        $genres = genres::all();
        return response()->json([
            'status'=>200,
            'pesan'=>'berhasil',
            'data'=>$genres
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
        $genres = new genres;
        $genres->nama_genre = $request->nama_genre;
        $genres->save();
        return response()->json([
            'status'=>200,
            'pesan'=>'berhasil',
            'data'=>$genres
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
        $genres = genres::find($id);
        return response()->json([
            'status'=>200,
            'pesan'=>'berhasil',
            'data'=>$genres
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
        $genres = genres::find($id);
        $genres->nama_genre = $request->nama_genre;
        $genres->save();
        return response()->json([
            'status'=>200,
            'pesan'=>'berhasil',
            'data'=>$genres
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
        $genres = genres::find($id);
        $genres->delete();
        return response()->json([
            'status'=>200,
            'pesan'=>'berhasil',
        ]);
    }
}
