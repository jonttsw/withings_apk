package com.withings.manualLogging.ui.feature.addNote.cycle;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Cycle2ManualLoggingNavigation.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/withings/manualLogging/ui/feature/addNote/cycle/Cycle2ManualLoggingNavigation$Destinations", "", "Lcom/withings/manualLogging/ui/feature/addNote/cycle/Cycle2ManualLoggingNavigation$Destinations;", "a", "manual-logging-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Cycle2ManualLoggingNavigation$Destinations {

    /* renamed from: b  reason: collision with root package name */
    public static final a f40743b;

    /* renamed from: c  reason: collision with root package name */
    public static final Cycle2ManualLoggingNavigation$Destinations f40744c;

    /* renamed from: d  reason: collision with root package name */
    public static final Cycle2ManualLoggingNavigation$Destinations f40745d;

    /* renamed from: e  reason: collision with root package name */
    public static final Cycle2ManualLoggingNavigation$Destinations f40746e;

    /* renamed from: f  reason: collision with root package name */
    public static final Cycle2ManualLoggingNavigation$Destinations f40747f;

    /* renamed from: g  reason: collision with root package name */
    public static final Cycle2ManualLoggingNavigation$Destinations f40748g;

    /* renamed from: h  reason: collision with root package name */
    public static final Cycle2ManualLoggingNavigation$Destinations f40749h;

    /* renamed from: i  reason: collision with root package name */
    private static final /* synthetic */ Cycle2ManualLoggingNavigation$Destinations[] f40750i;

    /* renamed from: a  reason: collision with root package name */
    private final String f40751a;

    /* compiled from: Cycle2ManualLoggingNavigation.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.withings.manualLogging.ui.feature.addNote.cycle.Cycle2ManualLoggingNavigation$Destinations$a, java.lang.Object] */
    static {
        Cycle2ManualLoggingNavigation$Destinations cycle2ManualLoggingNavigation$Destinations = new Cycle2ManualLoggingNavigation$Destinations("EntryScreen", 0, "cycle2ManualLoggingRoot");
        f40744c = cycle2ManualLoggingNavigation$Destinations;
        Cycle2ManualLoggingNavigation$Destinations cycle2ManualLoggingNavigation$Destinations2 = new Cycle2ManualLoggingNavigation$Destinations("AddPeriod", 1, "cycle2ManualLoggingRoot/addPeriod");
        f40745d = cycle2ManualLoggingNavigation$Destinations2;
        Cycle2ManualLoggingNavigation$Destinations cycle2ManualLoggingNavigation$Destinations3 = new Cycle2ManualLoggingNavigation$Destinations("AddCervicalMucus", 2, "cycle2ManualLoggingRoot/addCervicalMucus");
        f40746e = cycle2ManualLoggingNavigation$Destinations3;
        Cycle2ManualLoggingNavigation$Destinations cycle2ManualLoggingNavigation$Destinations4 = new Cycle2ManualLoggingNavigation$Destinations("AddMood", 3, "cycle2ManualLoggingRoot/addMood");
        f40747f = cycle2ManualLoggingNavigation$Destinations4;
        Cycle2ManualLoggingNavigation$Destinations cycle2ManualLoggingNavigation$Destinations5 = new Cycle2ManualLoggingNavigation$Destinations("AddSexualActivity", 4, "cycle2ManualLoggingRoot/addSexualActivity");
        f40748g = cycle2ManualLoggingNavigation$Destinations5;
        Cycle2ManualLoggingNavigation$Destinations cycle2ManualLoggingNavigation$Destinations6 = new Cycle2ManualLoggingNavigation$Destinations("AddSymptoms", 5, "cycle2ManualLoggingRoot/addSymptoms");
        f40749h = cycle2ManualLoggingNavigation$Destinations6;
        Cycle2ManualLoggingNavigation$Destinations[] cycle2ManualLoggingNavigation$DestinationsArr = {cycle2ManualLoggingNavigation$Destinations, cycle2ManualLoggingNavigation$Destinations2, cycle2ManualLoggingNavigation$Destinations3, cycle2ManualLoggingNavigation$Destinations4, cycle2ManualLoggingNavigation$Destinations5, cycle2ManualLoggingNavigation$Destinations6};
        f40750i = cycle2ManualLoggingNavigation$DestinationsArr;
        sm0.b.a(cycle2ManualLoggingNavigation$DestinationsArr);
        f40743b = new Object();
    }

    private Cycle2ManualLoggingNavigation$Destinations(String str, int i11, String str2) {
        this.f40751a = str2;
    }

    public static Cycle2ManualLoggingNavigation$Destinations valueOf(String str) {
        return (Cycle2ManualLoggingNavigation$Destinations) Enum.valueOf(Cycle2ManualLoggingNavigation$Destinations.class, str);
    }

    public static Cycle2ManualLoggingNavigation$Destinations[] values() {
        return (Cycle2ManualLoggingNavigation$Destinations[]) f40750i.clone();
    }

    public final String a() {
        return this.f40751a;
    }
}
