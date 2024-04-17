package com.withings.wiscale2.activity.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import tb0.b4;
/* compiled from: WorkoutDetailView.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/withings/wiscale2/activity/ui/WorkoutDetailView;", "Landroid/widget/LinearLayout;", "", "title", "Lnm0/y;", "setCountTitle", "(Ljava/lang/String;)V", "Ltb0/b4;", "a", "Ltb0/b4;", "getBinding", "()Ltb0/b4;", "binding", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WorkoutDetailView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final b4 f48614a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkoutDetailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        u.j(context, "context");
    }

    public final void a(String str, String str2, String str3, String str4) {
        b4 b4Var = this.f48614a;
        b4Var.f98885d.setTitle(str);
        b4Var.f98884c.setValue(str2);
        b4Var.f98882a.setValue(str3);
        b4Var.f98883b.setValue(str4);
    }

    public final b4 getBinding() {
        return this.f48614a;
    }

    public final void setCountTitle(String str) {
        this.f48614a.f98883b.setLabel(str);
    }

    public /* synthetic */ WorkoutDetailView(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkoutDetailView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        this.f48614a = b4.a(LayoutInflater.from(context), this);
        setOrientation(1);
    }
}
