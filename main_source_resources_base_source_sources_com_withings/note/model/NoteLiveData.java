package com.withings.note.model;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import ky.d;
import m70.i;
import qm0.f;
/* compiled from: NoteLiveData.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002BY\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0017\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b%\u0010&J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/withings/note/model/NoteLiveData;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/lifecycle/j0;", "", "Lcom/withings/note/model/NoteGroup;", "noteGroup", "Lnm0/y;", "onNoteGroupedChanged", "(Lcom/withings/note/model/NoteGroup;)V", "onActive", "()V", "onInactive", ConstantsWs.REDOX_DATA_MODEL_NOTE, "saveNote", "(Ljava/lang/String;)V", "Lqm0/f;", "coroutineContext", "Lqm0/f;", "getCoroutineContext", "()Lqm0/f;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "Landroidx/lifecycle/LiveData;", "", "Lky/d;", "groups", "Landroidx/lifecycle/LiveData;", "Lcom/withings/note/model/NoteRepository;", "noteRepository", "Lcom/withings/note/model/NoteRepository;", "", NavigationArguments.USER_ID, "J", "Lm70/i;", "userManager", "Lm70/i;", "<init>", "(Lqm0/f;Landroid/content/Context;Landroidx/lifecycle/LiveData;Lcom/withings/note/model/NoteRepository;Landroidx/lifecycle/LiveData;JLm70/i;)V", "note_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NoteLiveData extends j0<String> implements CoroutineScope {
    private final Context context;
    private final f coroutineContext;
    private final LiveData<List<d>> groups;
    private final LiveData<NoteGroup> noteGroup;
    private final NoteRepository noteRepository;
    private final long userId;
    private final i userManager;

    public NoteLiveData(f coroutineContext, Context context, LiveData<List<d>> liveData, NoteRepository noteRepository, LiveData<NoteGroup> noteGroup, long j5, i userManager) {
        u.j(coroutineContext, "coroutineContext");
        u.j(context, "context");
        u.j(noteRepository, "noteRepository");
        u.j(noteGroup, "noteGroup");
        u.j(userManager, "userManager");
        this.coroutineContext = coroutineContext;
        this.context = context;
        this.groups = liveData;
        this.noteRepository = noteRepository;
        this.noteGroup = noteGroup;
        this.userId = j5;
        this.userManager = userManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNoteGroupedChanged(NoteGroup noteGroup) {
        String str;
        List<d> value;
        d dVar;
        NoteText noteText;
        if (noteGroup == null || (noteText = NoteGroupKt.getNoteText(noteGroup)) == null || (str = noteText.getText()) == null) {
            LiveData<List<d>> liveData = this.groups;
            if (liveData != null && (value = liveData.getValue()) != null && (dVar = (d) x.K(value)) != null) {
                str = dVar.b();
            } else {
                str = null;
            }
        }
        postValue(str);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public f getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.j0, androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        addSource(this.noteGroup, new NoteLiveData$sam$androidx_lifecycle_Observer$0(new NoteLiveData$onActive$1(this)));
        LiveData<List<d>> liveData = this.groups;
        if (liveData != null) {
            addSource(liveData, new NoteLiveData$sam$androidx_lifecycle_Observer$0(new NoteLiveData$onActive$2$1(this)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.j0, androidx.lifecycle.LiveData
    public void onInactive() {
        removeSource(this.noteGroup);
        LiveData<List<d>> liveData = this.groups;
        if (liveData != null) {
            removeSource(liveData);
        }
        super.onInactive();
    }

    public final void saveNote(String note) {
        u.j(note, "note");
        if (!u.e(note, getValue())) {
            BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), null, new NoteLiveData$saveNote$1(this, note, null), 2, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ NoteLiveData(qm0.f r11, android.content.Context r12, androidx.lifecycle.LiveData r13, com.withings.note.model.NoteRepository r14, androidx.lifecycle.LiveData r15, long r16, m70.i r18, int r19, kotlin.jvm.internal.m r20) {
        /*
            r10 = this;
            r0 = r19 & 4
            if (r0 == 0) goto L7
            r0 = 0
            r4 = r0
            goto L8
        L7:
            r4 = r13
        L8:
            r0 = r19 & 64
            if (r0 == 0) goto L17
            m70.i r0 = m70.i.b()
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.u.i(r0, r1)
            r9 = r0
            goto L19
        L17:
            r9 = r18
        L19:
            r1 = r10
            r2 = r11
            r3 = r12
            r5 = r14
            r6 = r15
            r7 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.note.model.NoteLiveData.<init>(qm0.f, android.content.Context, androidx.lifecycle.LiveData, com.withings.note.model.NoteRepository, androidx.lifecycle.LiveData, long, m70.i, int, kotlin.jvm.internal.m):void");
    }
}
