package com.withings.weight.ui.limbExplore;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
/* compiled from: BodyCompositionType.kt */
/* loaded from: classes4.dex */
public final class BodyCompGraphTags {

    /* renamed from: a  reason: collision with root package name */
    private static final ArrayList f47628a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BodyCompositionType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/weight/ui/limbExplore/BodyCompGraphTags$MassGraphs;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class MassGraphs {

        /* renamed from: b  reason: collision with root package name */
        public static final MassGraphs f47629b;

        /* renamed from: c  reason: collision with root package name */
        public static final MassGraphs f47630c;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ MassGraphs[] f47631d;

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ sm0.a f47632e;

        /* renamed from: a  reason: collision with root package name */
        private final String f47633a;

        static {
            MassGraphs massGraphs = new MassGraphs("FAT_MASS_GRAPH_TAG", 0, "fatMassGraph");
            f47629b = massGraphs;
            MassGraphs massGraphs2 = new MassGraphs("MUSCLE_MASS_GRAPH_TAG", 1, "muscleMassGraph");
            f47630c = massGraphs2;
            MassGraphs[] massGraphsArr = {massGraphs, massGraphs2};
            f47631d = massGraphsArr;
            f47632e = sm0.b.a(massGraphsArr);
        }

        private MassGraphs(String str, int i11, String str2) {
            this.f47633a = str2;
        }

        public static sm0.a<MassGraphs> a() {
            return f47632e;
        }

        public static MassGraphs valueOf(String str) {
            return (MassGraphs) Enum.valueOf(MassGraphs.class, str);
        }

        public static MassGraphs[] values() {
            return (MassGraphs[]) f47631d.clone();
        }

        public final String b() {
            return this.f47633a;
        }
    }

    static {
        sm0.a<MassGraphs> a11 = MassGraphs.a();
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(a11, 10));
        Iterator it = ((kotlin.collections.c) a11).iterator();
        while (it.hasNext()) {
            arrayList.add(((MassGraphs) it.next()).b());
        }
        f47628a = arrayList;
    }

    public static ArrayList a() {
        return f47628a;
    }
}
