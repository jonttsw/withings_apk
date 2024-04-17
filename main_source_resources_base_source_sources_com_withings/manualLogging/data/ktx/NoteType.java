package com.withings.manualLogging.data.ktx;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Note.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/manualLogging/data/ktx/NoteType;", "", "manual-logging-data_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NoteType {

    /* renamed from: b  reason: collision with root package name */
    public static final NoteType f40687b;

    /* renamed from: c  reason: collision with root package name */
    public static final NoteType f40688c;

    /* renamed from: d  reason: collision with root package name */
    public static final NoteType f40689d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ NoteType[] f40690e;

    /* renamed from: a  reason: collision with root package name */
    private final int f40691a;

    static {
        NoteType noteType = new NoteType("Comment", 0, 3);
        f40687b = noteType;
        NoteType noteType2 = new NoteType("Mood", 1, 4);
        NoteType noteType3 = new NoteType("Medicine", 2, 1);
        f40688c = noteType3;
        NoteType noteType4 = new NoteType("Symptom", 3, 2);
        f40689d = noteType4;
        NoteType[] noteTypeArr = {noteType, noteType2, noteType3, noteType4};
        f40690e = noteTypeArr;
        b.a(noteTypeArr);
    }

    private NoteType(String str, int i11, int i12) {
        this.f40691a = i12;
    }

    public static NoteType valueOf(String str) {
        return (NoteType) Enum.valueOf(NoteType.class, str);
    }

    public static NoteType[] values() {
        return (NoteType[]) f40690e.clone();
    }

    public final int a() {
        return this.f40691a;
    }
}
