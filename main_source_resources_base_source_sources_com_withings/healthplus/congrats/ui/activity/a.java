package com.withings.healthplus.congrats.ui.activity;

import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.j;
import nm0.y;
import ym0.p;
/* compiled from: CompletionActivity.kt */
/* loaded from: classes3.dex */
final class a extends w implements p<String, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CompletionActivity f40090a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CompletionActivity completionActivity) {
        super(2);
        this.f40090a = completionActivity;
    }

    @Override // ym0.p
    public final y invoke(String str, Integer num) {
        boolean z5;
        String str2;
        String taskId = str;
        int intValue = num.intValue();
        u.j(taskId, "taskId");
        if (CompletionActivity.z3(this.f40090a) != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        int i11 = v70.a.f103433b;
        j[] jVarArr = new j[2];
        if (z5) {
            str2 = "task_";
        } else {
            str2 = "mission_";
        }
        String concat = str2.concat("rate");
        u.i(concat, "toString(...)");
        jVarArr[0] = new j("flow_step_name", concat);
        jVarArr[1] = new j("flow_specificity", x.W(taskId, Integer.valueOf(intValue)));
        v70.a.d("feedback", "feedback", s0.j(jVarArr), true);
        return y.f85009a;
    }
}
