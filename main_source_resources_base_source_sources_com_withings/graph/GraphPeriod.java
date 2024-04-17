package com.withings.graph;

import com.withings.favorite.model.FavoriteCategoryKt;
import com.withings.periodsbar.Period;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GraphPeriod.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/graph/GraphPeriod;", "", "a", "graph_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GraphPeriod {

    /* renamed from: a  reason: collision with root package name */
    public static final a f39501a;

    /* renamed from: b  reason: collision with root package name */
    public static final GraphPeriod f39502b;

    /* renamed from: c  reason: collision with root package name */
    public static final GraphPeriod f39503c;

    /* renamed from: d  reason: collision with root package name */
    public static final GraphPeriod f39504d;

    /* renamed from: e  reason: collision with root package name */
    public static final GraphPeriod f39505e;

    /* renamed from: f  reason: collision with root package name */
    public static final GraphPeriod f39506f;

    /* renamed from: g  reason: collision with root package name */
    public static final GraphPeriod f39507g;

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ GraphPeriod[] f39508h;

    /* compiled from: GraphPeriod.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(int i11) {
            this();
        }

        public static GraphPeriod a(int i11) {
            if (i11 == -1) {
                return GraphPeriod.f39507g;
            }
            if (i11 < 7) {
                return GraphPeriod.f39502b;
            }
            if (i11 < 31) {
                return GraphPeriod.f39503c;
            }
            if (i11 < 92) {
                return GraphPeriod.f39504d;
            }
            if (i11 < 365) {
                return GraphPeriod.f39505e;
            }
            return GraphPeriod.f39506f;
        }

        private a() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.graph.GraphPeriod] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.graph.GraphPeriod] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Enum, com.withings.graph.GraphPeriod] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.graph.GraphPeriod] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.graph.GraphPeriod] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, com.withings.graph.GraphPeriod] */
    static {
        ?? r02 = new Enum("Day", 0);
        f39502b = r02;
        ?? r12 = new Enum("Week", 1);
        f39503c = r12;
        ?? r22 = new Enum("Month", 2);
        f39504d = r22;
        ?? r32 = new Enum("Quarter", 3);
        f39505e = r32;
        ?? r42 = new Enum("Year", 4);
        f39506f = r42;
        ?? r52 = new Enum(FavoriteCategoryKt.SEGMENTED_ITEM_ALL_KEY, 5);
        f39507g = r52;
        GraphPeriod[] graphPeriodArr = {r02, r12, r22, r32, r42, r52};
        f39508h = graphPeriodArr;
        sm0.b.a(graphPeriodArr);
        f39501a = new a(0);
    }

    private GraphPeriod() {
        throw null;
    }

    public static GraphPeriod valueOf(String str) {
        return (GraphPeriod) Enum.valueOf(GraphPeriod.class, str);
    }

    public static GraphPeriod[] values() {
        return (GraphPeriod[]) f39508h.clone();
    }

    public final Period a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return Period.f43726k;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        return Period.f43725j;
                    }
                    return Period.f43724i;
                }
                return Period.f43723h;
            }
            return Period.f43722g;
        }
        return Period.f43721f;
    }

    public final int b() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return -1;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return 365;
                }
                return 92;
            }
            return 31;
        }
        return 7;
    }
}
