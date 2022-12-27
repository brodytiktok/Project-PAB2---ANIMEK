<?php

namespace App\Http\Controllers\API;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use App\Models\Seiyuus;

class SeiyuuController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        $seiyuus = Seiyuus::all();
        return response()->json([
            'status'=>200,
            'pesan'=>'berhasil',
            'data'=>$seiyuus
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
        $seiyuus = new Seiyuus;
        $seiyuus->foto_seiyuu = $request->foto_seiyuu;
        $seiyuus->nama_seiyuu = $request->nama_seiyuu;
        $seiyuus->save();
        return response()->json([
            'status'=>200,
            'pesan'=>'berhasil',
            'data'=>$seiyuus
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
        $seiyuus = Seiyuus::find($id);
        return response()->json([
            'status'=>200,
            'pesan'=>'berhasil',
            'data'=>$seiyuus
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
        $seiyuus = Seiyuus::find($id);
        $seiyuus->foto_seiyuu = $request->foto_seiyuu;
        $seiyuus->nama_seiyuu = $request->nama_seiyuu;
        $seiyuus->save();
        return response()->json([
            'status'=>200,
            'pesan'=>'berhasil',
            'data'=>$seiyuus
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
        $seiyuus = Seiyuus::find($id);
        $seiyuus->delete();
        return response()->json([
            'status'=>200,
            'pesan'=>'berhasil',
        ]);
    }
}
