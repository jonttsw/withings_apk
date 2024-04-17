package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.health.connect.client.records.CervicalMucusRecord;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
/* compiled from: WorkoutPreview.kt */
/* loaded from: classes4.dex */
final class g7 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutPreview f49205a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f49206b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Bitmap f49207c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(WorkoutPreview workoutPreview, long j5, Bitmap bitmap) {
        super(0);
        this.f49205a = workoutPreview;
        this.f49206b = j5;
        this.f49207c = bitmap;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        String str;
        WorkoutPreview workoutPreview = this.f49205a;
        Context context = workoutPreview.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        if (ah.u.D(context)) {
            str = "dark";
        } else {
            str = CervicalMucusRecord.Sensation.LIGHT;
        }
        String format = String.format("workout-%d-%s.jpeg", Arrays.copyOf(new Object[]{Long.valueOf(this.f49206b), str}, 2));
        File file = new File(workoutPreview.getContext().getCacheDir(), "map-snapshots");
        file.mkdirs();
        File file2 = new File(file, format);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f49207c.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        if (byteArrayOutputStream.size() <= 102400) {
            byteArrayOutputStream = null;
        }
        if (byteArrayOutputStream != null) {
            try {
                byteArrayOutputStream.writeTo(new FileOutputStream(file2));
                nm0.y yVar = nm0.y.f85009a;
                ge0.d.a(byteArrayOutputStream, null);
            } finally {
            }
        }
        return nm0.y.f85009a;
    }
}
