package com.withings.manualLogging.ui.feature.addNote;
/* compiled from: AddManualLogActivity.kt */
/* loaded from: classes4.dex */
final class v extends kotlin.jvm.internal.w implements ym0.l<fx.f, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AddManualLogActivity f41598a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f41599b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(r8.n nVar, AddManualLogActivity addManualLogActivity) {
        super(1);
        this.f41598a = addManualLogActivity;
        this.f41599b = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(fx.f fVar) {
        fx.f it = fVar;
        kotlin.jvm.internal.u.j(it, "it");
        v70.a.e("learn_more_about_symptom", "learn_more_about_symptom", null, true, 4);
        String k11 = it.k();
        String b10 = it.b();
        AddManualLogActivity addManualLogActivity = this.f41598a;
        String title = pm.n.a(addManualLogActivity, k11, b10);
        String description = pm.n.a(addManualLogActivity, it.f(), it.e());
        kotlin.jvm.internal.u.j(title, "title");
        kotlin.jvm.internal.u.j(description, "description");
        androidx.navigation.e.L(this.f41599b, "simpleDescriptionBottomSheet/" + title + "/" + description, null, 6);
        return nm0.y.f85009a;
    }
}
