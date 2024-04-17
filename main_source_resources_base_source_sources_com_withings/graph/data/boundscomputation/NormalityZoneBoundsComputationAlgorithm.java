package com.withings.graph.data.boundscomputation;

import android.graphics.PointF;
import android.graphics.RectF;
import gx.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.j;
import rs.e;
import sm0.b;
/* compiled from: NormalityZoneBoundsComputationAlgorithm.kt */
/* loaded from: classes3.dex */
public final class NormalityZoneBoundsComputationAlgorithm extends a {

    /* renamed from: a  reason: collision with root package name */
    private NormalityZoneType f39671a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NormalityZoneBoundsComputationAlgorithm.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/graph/data/boundscomputation/NormalityZoneBoundsComputationAlgorithm$NormalityZoneType;", "", "graph_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class NormalityZoneType {

        /* renamed from: a  reason: collision with root package name */
        public static final NormalityZoneType f39672a;

        /* renamed from: b  reason: collision with root package name */
        public static final NormalityZoneType f39673b;

        /* renamed from: c  reason: collision with root package name */
        public static final NormalityZoneType f39674c;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ NormalityZoneType[] f39675d;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.graph.data.boundscomputation.NormalityZoneBoundsComputationAlgorithm$NormalityZoneType] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.graph.data.boundscomputation.NormalityZoneBoundsComputationAlgorithm$NormalityZoneType] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.graph.data.boundscomputation.NormalityZoneBoundsComputationAlgorithm$NormalityZoneType] */
        static {
            ?? r02 = new Enum("UNCONSTRAINED_MAXIMUM", 0);
            f39672a = r02;
            ?? r12 = new Enum("RANGE", 1);
            f39673b = r12;
            ?? r22 = new Enum("UNCONSTRAINED_MINIMUM", 2);
            f39674c = r22;
            NormalityZoneType[] normalityZoneTypeArr = {r02, r12, r22};
            f39675d = normalityZoneTypeArr;
            b.a(normalityZoneTypeArr);
        }

        private NormalityZoneType() {
            throw null;
        }

        public static NormalityZoneType valueOf(String str) {
            return (NormalityZoneType) Enum.valueOf(NormalityZoneType.class, str);
        }

        public static NormalityZoneType[] values() {
            return (NormalityZoneType[]) f39675d.clone();
        }
    }

    public NormalityZoneBoundsComputationAlgorithm(NormalityZoneType normalityZoneType) {
        this.f39671a = normalityZoneType;
    }

    @Override // gx.a, qs.a
    public final j<PointF, PointF> a(List<? extends e> data, int i11, int i12, RectF currentViewport) {
        u.j(data, "data");
        u.j(currentViewport, "currentViewport");
        j<PointF, PointF> a11 = super.a(data, i11, i12, currentViewport);
        if (a11 == null) {
            return null;
        }
        int ordinal = this.f39671a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                a11.c().y = a11.d().y;
            }
        } else {
            a11.d().y = a11.c().y;
        }
        return a11;
    }
}
