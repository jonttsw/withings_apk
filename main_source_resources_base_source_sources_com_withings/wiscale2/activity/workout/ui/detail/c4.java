package com.withings.wiscale2.activity.workout.ui.detail;
/* compiled from: WorkoutHeader.kt */
/* loaded from: classes4.dex */
public abstract class c4 {

    /* renamed from: a  reason: collision with root package name */
    private final String f49147a;

    public c4(String str) {
        this.f49147a = str;
    }

    public final String a() {
        return this.f49147a;
    }

    public final Object b() {
        d0 d0Var;
        c0 c0Var;
        Object c11;
        if (this instanceof d0) {
            d0Var = (d0) this;
        } else {
            d0Var = null;
        }
        if (d0Var != null && (c11 = d0Var.c()) != null) {
            return c11;
        }
        if (this instanceof c0) {
            c0Var = (c0) this;
        } else {
            c0Var = null;
        }
        if (c0Var == null) {
            return null;
        }
        return c0Var.g();
    }
}
