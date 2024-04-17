package com.withings.graph.filters;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Filter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/graph/filters/Filter;", "", "graph_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class Filter {

    /* renamed from: a  reason: collision with root package name */
    public static final Filter f39917a;

    /* renamed from: b  reason: collision with root package name */
    public static final Filter f39918b;

    /* renamed from: c  reason: collision with root package name */
    public static final Filter f39919c;

    /* renamed from: d  reason: collision with root package name */
    public static final Filter f39920d;

    /* renamed from: e  reason: collision with root package name */
    public static final Filter f39921e;

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ Filter[] f39922f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.graph.filters.Filter] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.graph.filters.Filter] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.graph.filters.Filter] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.graph.filters.Filter] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.graph.filters.Filter] */
    static {
        ?? r02 = new Enum("NONE", 0);
        f39917a = r02;
        ?? r12 = new Enum("LATEST", 1);
        f39918b = r12;
        ?? r22 = new Enum("RANGE", 2);
        f39919c = r22;
        ?? r32 = new Enum("AVERAGE", 3);
        f39920d = r32;
        ?? r42 = new Enum("TREND", 4);
        f39921e = r42;
        Filter[] filterArr = {r02, r12, r22, r32, r42};
        f39922f = filterArr;
        b.a(filterArr);
    }

    private Filter() {
        throw null;
    }

    public static Filter valueOf(String str) {
        return (Filter) Enum.valueOf(Filter.class, str);
    }

    public static Filter[] values() {
        return (Filter[]) f39922f.clone();
    }
}
