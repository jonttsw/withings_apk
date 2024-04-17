package com.withings.weight.presentation.entities;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.c;
import kotlin.collections.x;
import sm0.a;
import sm0.b;
/* compiled from: BodyCompGraphTags.kt */
/* loaded from: classes4.dex */
public final class BodyCompGraphTags {

    /* renamed from: a  reason: collision with root package name */
    private static final ArrayList f47094a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BodyCompGraphTags.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/weight/presentation/entities/BodyCompGraphTags$MassGraphs;", "", "weight-ui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class MassGraphs {

        /* renamed from: b  reason: collision with root package name */
        public static final MassGraphs f47095b;

        /* renamed from: c  reason: collision with root package name */
        public static final MassGraphs f47096c;

        /* renamed from: d  reason: collision with root package name */
        public static final MassGraphs f47097d;

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ MassGraphs[] f47098e;

        /* renamed from: f  reason: collision with root package name */
        private static final /* synthetic */ a f47099f;

        /* renamed from: a  reason: collision with root package name */
        private final String f47100a;

        static {
            MassGraphs massGraphs = new MassGraphs("FAT_MASS_GRAPH_TAG", 0, "fatMassGraph");
            f47095b = massGraphs;
            MassGraphs massGraphs2 = new MassGraphs("MUSCLE_MASS_GRAPH_TAG", 1, "muscleMassGraph");
            f47096c = massGraphs2;
            MassGraphs massGraphs3 = new MassGraphs("BONE_MASS_GRAPH_TAG", 2, "boneMassGraph");
            f47097d = massGraphs3;
            MassGraphs[] massGraphsArr = {massGraphs, massGraphs2, massGraphs3};
            f47098e = massGraphsArr;
            f47099f = b.a(massGraphsArr);
        }

        private MassGraphs(String str, int i11, String str2) {
            this.f47100a = str2;
        }

        public static a<MassGraphs> a() {
            return f47099f;
        }

        public static MassGraphs valueOf(String str) {
            return (MassGraphs) Enum.valueOf(MassGraphs.class, str);
        }

        public static MassGraphs[] values() {
            return (MassGraphs[]) f47098e.clone();
        }

        public final String b() {
            return this.f47100a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BodyCompGraphTags.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/weight/presentation/entities/BodyCompGraphTags$NormalityZones;", "", "weight-ui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class NormalityZones {

        /* renamed from: b  reason: collision with root package name */
        public static final NormalityZones f47101b;

        /* renamed from: c  reason: collision with root package name */
        public static final NormalityZones f47102c;

        /* renamed from: d  reason: collision with root package name */
        public static final NormalityZones f47103d;

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ NormalityZones[] f47104e;

        /* renamed from: f  reason: collision with root package name */
        private static final /* synthetic */ a f47105f;

        /* renamed from: a  reason: collision with root package name */
        private final String f47106a;

        static {
            NormalityZones normalityZones = new NormalityZones("FAT_NORMALITY_ZONE_GRAPH_TAG", 0, "fatNormalityZoneGraph");
            f47101b = normalityZones;
            NormalityZones normalityZones2 = new NormalityZones("MUSCLE_NORMALITY_ZONE_GRAPH_TAG", 1, "muscleNormalityZoneGraph");
            f47102c = normalityZones2;
            NormalityZones normalityZones3 = new NormalityZones("BONE_NORMALITY_ZONE_GRAPH_TAG", 2, "boneNormalityZoneGraph");
            f47103d = normalityZones3;
            NormalityZones[] normalityZonesArr = {normalityZones, normalityZones2, normalityZones3};
            f47104e = normalityZonesArr;
            f47105f = b.a(normalityZonesArr);
        }

        private NormalityZones(String str, int i11, String str2) {
            this.f47106a = str2;
        }

        public static a<NormalityZones> a() {
            return f47105f;
        }

        public static NormalityZones valueOf(String str) {
            return (NormalityZones) Enum.valueOf(NormalityZones.class, str);
        }

        public static NormalityZones[] values() {
            return (NormalityZones[]) f47104e.clone();
        }

        public final String b() {
            return this.f47106a;
        }
    }

    static {
        a<MassGraphs> a11 = MassGraphs.a();
        ArrayList arrayList = new ArrayList(x.y(a11, 10));
        Iterator it = ((c) a11).iterator();
        while (it.hasNext()) {
            arrayList.add(((MassGraphs) it.next()).b());
        }
        a<NormalityZones> a12 = NormalityZones.a();
        ArrayList arrayList2 = new ArrayList(x.y(a12, 10));
        Iterator it2 = ((c) a12).iterator();
        while (it2.hasNext()) {
            arrayList2.add(((NormalityZones) it2.next()).b());
        }
        f47094a = x.l0(arrayList2, arrayList);
    }

    public static ArrayList a() {
        return f47094a;
    }
}
