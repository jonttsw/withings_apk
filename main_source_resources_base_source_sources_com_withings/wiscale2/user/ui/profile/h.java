package com.withings.wiscale2.user.ui.profile;

import com.withings.common.compose.component.bottomSheet.PictureOption;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileActivity.kt */
/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.w implements ym0.l<PictureOption, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditProfileActivity f61958a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(EditProfileActivity editProfileActivity) {
        super(1);
        this.f61958a = editProfileActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(PictureOption pictureOption) {
        PictureOption option = pictureOption;
        kotlin.jvm.internal.u.j(option, "option");
        this.f61958a.L3().g1(option);
        return nm0.y.f85009a;
    }
}
