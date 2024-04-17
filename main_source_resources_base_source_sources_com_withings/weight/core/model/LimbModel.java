package com.withings.weight.core.model;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LimbModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/weight/core/model/LimbModel;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LimbModel {

    /* renamed from: a  reason: collision with root package name */
    public static final LimbModel f46985a;

    /* renamed from: b  reason: collision with root package name */
    public static final LimbModel f46986b;

    /* renamed from: c  reason: collision with root package name */
    public static final LimbModel f46987c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ LimbModel[] f46988d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.weight.core.model.LimbModel] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.weight.core.model.LimbModel] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.weight.core.model.LimbModel] */
    static {
        ?? r02 = new Enum("Arms", 0);
        f46985a = r02;
        ?? r12 = new Enum("Torso", 1);
        f46986b = r12;
        ?? r22 = new Enum("Legs", 2);
        f46987c = r22;
        LimbModel[] limbModelArr = {r02, r12, r22};
        f46988d = limbModelArr;
        b.a(limbModelArr);
    }

    private LimbModel() {
        throw null;
    }

    public static LimbModel valueOf(String str) {
        return (LimbModel) Enum.valueOf(LimbModel.class, str);
    }

    public static LimbModel[] values() {
        return (LimbModel[]) f46988d.clone();
    }
}
