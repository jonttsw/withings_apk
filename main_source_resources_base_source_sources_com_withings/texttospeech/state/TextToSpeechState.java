package com.withings.texttospeech.state;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TextToSpeechStates.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/texttospeech/state/TextToSpeechState;", "", "texttospeech_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class TextToSpeechState {

    /* renamed from: a  reason: collision with root package name */
    public static final TextToSpeechState f44539a;

    /* renamed from: b  reason: collision with root package name */
    public static final TextToSpeechState f44540b;

    /* renamed from: c  reason: collision with root package name */
    public static final TextToSpeechState f44541c;

    /* renamed from: d  reason: collision with root package name */
    public static final TextToSpeechState f44542d;

    /* renamed from: e  reason: collision with root package name */
    public static final TextToSpeechState f44543e;

    /* renamed from: f  reason: collision with root package name */
    public static final TextToSpeechState f44544f;

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ TextToSpeechState[] f44545g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.texttospeech.state.TextToSpeechState] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.texttospeech.state.TextToSpeechState] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.texttospeech.state.TextToSpeechState] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.texttospeech.state.TextToSpeechState] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.texttospeech.state.TextToSpeechState] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, com.withings.texttospeech.state.TextToSpeechState] */
    static {
        ?? r02 = new Enum("Buffering", 0);
        f44539a = r02;
        ?? r12 = new Enum("Done", 1);
        f44540b = r12;
        ?? r22 = new Enum("NotInitialized", 2);
        f44541c = r22;
        ?? r32 = new Enum("Pause", 3);
        f44542d = r32;
        ?? r42 = new Enum("Restarting", 4);
        f44543e = r42;
        ?? r52 = new Enum("Speaking", 5);
        f44544f = r52;
        TextToSpeechState[] textToSpeechStateArr = {r02, r12, r22, r32, r42, r52};
        f44545g = textToSpeechStateArr;
        b.a(textToSpeechStateArr);
    }

    private TextToSpeechState() {
        throw null;
    }

    public static TextToSpeechState valueOf(String str) {
        return (TextToSpeechState) Enum.valueOf(TextToSpeechState.class, str);
    }

    public static TextToSpeechState[] values() {
        return (TextToSpeechState[]) f44545g.clone();
    }
}
