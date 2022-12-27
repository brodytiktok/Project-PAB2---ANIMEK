<?php

namespace App\Http\Controllers\API;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use App\Models\Characters;

class CharacterController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        $characters = Characters::all();
        return response()->json([
            'status'=>200,
            'pesan'=>'berhasil',
            'data'=>$characters
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
        $characters = new Characters;
        $characters->id_seiyuu = $request->id_seiyuu;
        $characters->foto_character = $request->foto_character;
        $characters->nama_character = $request->nama_character;
        $characters->save();
        return response()->json([
            'status'=>200,
            'pesan'=>'berhasil',
            'data'=>$characters
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
        $characters = Characters::find($id);
        return response()->json([
            'status'=>200,
            'pesan'=>'berhasil',
            'data'=>$characters
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
        $characters = Characters::find($id);
        $characters->id_seiyuu = $request->id_seiyuu;
        $characters->foto_character = $request->foto_character;
        $characters->nama_character = $request->nama_character;
        $characters->save();
        return response()->json([
            'status'=>200,
            'pesan'=>'berhasil',
            'data'=>$characters
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
        $characters = Characters::find($id);
        $characters->delete();
        return response()->json([
            'status'=>200,
            'pesan'=>'berhasil',
        ]);
    }
}
