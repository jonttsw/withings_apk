package com.withings.wiscale2.heart.heartrate;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HeartRateDayFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/heart/heartrate/LoadingState;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LoadingState {

    /* renamed from: a  reason: collision with root package name */
    public static final LoadingState f57529a;

    /* renamed from: b  reason: collision with root package name */
    public static final LoadingState f57530b;

    /* renamed from: c  reason: collision with root package name */
    public static final LoadingState f57531c;

    /* renamed from: d  reason: collision with root package name */
    public static final LoadingState f57532d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ LoadingState[] f57533e;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.wiscale2.heart.heartrate.LoadingState, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.wiscale2.heart.heartrate.LoadingState, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.wiscale2.heart.heartrate.LoadingState, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.withings.wiscale2.heart.heartrate.LoadingState, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Downloading", 0);
        f57529a = r02;
        ?? r12 = new Enum("HasData", 1);
        f57530b = r12;
        ?? r22 = new Enum("NoData", 2);
        f57531c = r22;
        ?? r32 = new Enum("DownloadError", 3);
        f57532d = r32;
        LoadingState[] loadingStateArr = {r02, r12, r22, r32};
        f57533e = loadingStateArr;
        sm0.b.a(loadingStateArr);
    }

    private LoadingState() {
        throw null;
    }

    public static LoadingState valueOf(String str) {
        return (LoadingState) Enum.valueOf(LoadingState.class, str);
    }

    public static LoadingState[] values() {
        return (LoadingState[]) f57533e.clone();
    }
}
