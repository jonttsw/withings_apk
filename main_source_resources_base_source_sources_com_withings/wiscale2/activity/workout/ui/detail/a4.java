package com.withings.wiscale2.activity.workout.ui.detail;

import androidx.recyclerview.widget.m;
/* compiled from: AllWorkoutsActivity.kt */
/* loaded from: classes4.dex */
public final class a4 extends m.f<Object> {
    @Override // androidx.recyclerview.widget.m.f
    public final boolean areContentsTheSame(Object oldItem, Object newItem) {
        sg0.a aVar;
        l7 l7Var;
        kotlin.jvm.internal.u.j(oldItem, "oldItem");
        kotlin.jvm.internal.u.j(newItem, "newItem");
        boolean z5 = oldItem instanceof l7;
        Object obj = null;
        if (z5) {
            if (z5) {
                l7Var = (l7) oldItem;
            } else {
                l7Var = null;
            }
            if (newItem instanceof l7) {
                obj = (l7) newItem;
            }
            return kotlin.jvm.internal.u.e(l7Var, obj);
        }
        boolean z11 = oldItem instanceof sg0.a;
        if (z11) {
            if (z11) {
                aVar = (sg0.a) oldItem;
            } else {
                aVar = null;
            }
            if (newItem instanceof sg0.a) {
                obj = (sg0.a) newItem;
            }
            return kotlin.jvm.internal.u.e(aVar, obj);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.m.f
    public final boolean areItemsTheSame(Object oldItem, Object newItem) {
        sg0.a aVar;
        kotlin.jvm.internal.u.j(oldItem, "oldItem");
        kotlin.jvm.internal.u.j(newItem, "newItem");
        boolean z5 = oldItem instanceof l7;
        String str = null;
        l7 l7Var = null;
        if (z5) {
            if (z5) {
                l7Var = (l7) oldItem;
            }
            if (l7Var == null || ((l7) oldItem).k() != l7Var.k()) {
                return false;
            }
            return true;
        } else if (!(oldItem instanceof sg0.a)) {
            return false;
        } else {
            String a11 = ((sg0.a) oldItem).a();
            if (newItem instanceof sg0.a) {
                aVar = (sg0.a) newItem;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                str = aVar.a();
            }
            return kotlin.jvm.internal.u.e(a11, str);
        }
    }
}
