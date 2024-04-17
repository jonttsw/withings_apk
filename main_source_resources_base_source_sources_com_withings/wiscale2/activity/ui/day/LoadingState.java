package com.withings.wiscale2.activity.ui.day;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActivityDayViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/activity/ui/day/LoadingState;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LoadingState {

    /* renamed from: a  reason: collision with root package name */
    public static final LoadingState f48630a;

    /* renamed from: b  reason: collision with root package name */
    public static final LoadingState f48631b;

    /* renamed from: c  reason: collision with root package name */
    public static final LoadingState f48632c;

    /* renamed from: d  reason: collision with root package name */
    public static final LoadingState f48633d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ LoadingState[] f48634e;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.wiscale2.activity.ui.day.LoadingState, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.wiscale2.activity.ui.day.LoadingState, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.wiscale2.activity.ui.day.LoadingState, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.withings.wiscale2.activity.ui.day.LoadingState, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.withings.wiscale2.activity.ui.day.LoadingState, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Loading", 0);
        ?? r12 = new Enum("Downloading", 1);
        f48630a = r12;
        ?? r22 = new Enum("HasData", 2);
        f48631b = r22;
        ?? r32 = new Enum("NoData", 3);
        f48632c = r32;
        ?? r42 = new Enum("DownloadError", 4);
        f48633d = r42;
        LoadingState[] loadingStateArr = {r02, r12, r22, r32, r42};
        f48634e = loadingStateArr;
        b.a(loadingStateArr);
    }

    private LoadingState() {
        throw null;
    }

    public static LoadingState valueOf(String str) {
        return (LoadingState) Enum.valueOf(LoadingState.class, str);
    }

    public static LoadingState[] values() {
        return (LoadingState[]) f48634e.clone();
    }
}
