package com.withings.ecg.model;

import android.content.Context;
import androidx.camera.camera2.internal.q;
import com.withings.library.authentication.api.ConstantsWs;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import mq.f;
import nm0.y;
import org.joda.time.DateTime;
import wm0.b;
/* compiled from: EcgSignalSaver.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/withings/ecg/model/EcgSignalSaver;", "", "Lnm0/y;", "start", "()V", "", "byteArray", "savePayloads", "([B)V", "", "measureId", "", "getSignalPath", "(J)Ljava/lang/String;", "cancel", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "Ljava/io/File;", "file", "Ljava/io/File;", "<init>", "(Landroid/content/Context;)V", "Companion", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class EcgSignalSaver {
    public static final String FILE_NAME = "ecg-live-signals-";
    private final Context context;
    private File file;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EcgSignalSaver.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/ecg/model/EcgSignalSaver$Companion;", "", "()V", "FILE_NAME", "", "ecg_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public EcgSignalSaver(Context context) {
        u.j(context, "context");
        this.context = context;
    }

    public final void cancel() {
        File file = this.file;
        if (file != null) {
            file.delete();
        }
    }

    public final String getSignalPath(long j5) {
        File a11 = new f(this.context).a(1, j5);
        File file = this.file;
        if (file != null) {
            file.renameTo(a11);
        }
        String path = a11.getPath();
        u.i(path, "getPath(...)");
        return path;
    }

    public final void savePayloads(byte[] byteArray) {
        y yVar;
        u.j(byteArray, "byteArray");
        File file = this.file;
        if (file != null) {
            b.a(file, byteArray);
            yVar = y.f85009a;
        } else {
            yVar = null;
        }
        if (yVar != null) {
            return;
        }
        throw new IllegalStateException("You must use start() before saving payloads");
    }

    public final void start() {
        File file = new File(this.context.getFilesDir(), q.c(FILE_NAME, DateTime.now().getMillis()));
        this.file = file;
        b.f(file, new byte[0]);
    }
}
