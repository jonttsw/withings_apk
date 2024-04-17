package com.withings.graph.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import sm0.b;
import ws.d;
/* compiled from: NormalityZoneUiModel.kt */
/* loaded from: classes3.dex */
public final class NormalityZoneUiModel {

    /* renamed from: a  reason: collision with root package name */
    private final Status f39965a;

    /* renamed from: b  reason: collision with root package name */
    private final List<d> f39966b;

    /* renamed from: c  reason: collision with root package name */
    private final Type f39967c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NormalityZoneUiModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/graph/model/NormalityZoneUiModel$Status;", "", "graph_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class Status {

        /* renamed from: a  reason: collision with root package name */
        public static final Status f39968a;

        /* renamed from: b  reason: collision with root package name */
        public static final Status f39969b;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ Status[] f39970c;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.graph.model.NormalityZoneUiModel$Status] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.graph.model.NormalityZoneUiModel$Status] */
        static {
            ?? r02 = new Enum("NORMAL", 0);
            f39968a = r02;
            ?? r12 = new Enum("WARNING", 1);
            f39969b = r12;
            Status[] statusArr = {r02, r12};
            f39970c = statusArr;
            b.a(statusArr);
        }

        private Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f39970c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NormalityZoneUiModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/graph/model/NormalityZoneUiModel$Type;", "", "graph_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class Type {

        /* renamed from: a  reason: collision with root package name */
        public static final Type f39971a;

        /* renamed from: b  reason: collision with root package name */
        public static final Type f39972b;

        /* renamed from: c  reason: collision with root package name */
        public static final Type f39973c;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ Type[] f39974d;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.graph.model.NormalityZoneUiModel$Type] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.graph.model.NormalityZoneUiModel$Type] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.graph.model.NormalityZoneUiModel$Type] */
        static {
            ?? r02 = new Enum("UNCONSTRAINED_MAXIMUM", 0);
            f39971a = r02;
            ?? r12 = new Enum("RANGE", 1);
            f39972b = r12;
            ?? r22 = new Enum("UNCONSTRAINED_MINIMUM", 2);
            f39973c = r22;
            Type[] typeArr = {r02, r12, r22};
            f39974d = typeArr;
            b.a(typeArr);
        }

        private Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f39974d.clone();
        }
    }

    public NormalityZoneUiModel(Status status, List<d> list, Type type) {
        u.j(status, "status");
        u.j(type, "type");
        this.f39965a = status;
        this.f39966b = list;
        this.f39967c = type;
    }

    public final Status a() {
        return this.f39965a;
    }

    public final Type b() {
        return this.f39967c;
    }

    public final List<d> c() {
        return this.f39966b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NormalityZoneUiModel)) {
            return false;
        }
        NormalityZoneUiModel normalityZoneUiModel = (NormalityZoneUiModel) obj;
        if (this.f39965a == normalityZoneUiModel.f39965a && u.e(this.f39966b, normalityZoneUiModel.f39966b) && this.f39967c == normalityZoneUiModel.f39967c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39967c.hashCode() + e.b(this.f39966b, this.f39965a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "NormalityZoneUiModel(status=" + this.f39965a + ", values=" + this.f39966b + ", type=" + this.f39967c + ")";
    }
}
