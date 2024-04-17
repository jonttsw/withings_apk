package com.withings.note.model;

import com.google.gson.annotations.SerializedName;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: Note.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b(\u0018\u00002\u00020\u0001B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u007f\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0002\u0010\u0016J\b\u00108\u001a\u00020\u0011H\u0016R\u001e\u0010\f\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0015\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\u001aR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010\u001aR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001aR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR\u001e\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b,\u0010\u0018\"\u0004\b-\u0010\u001aR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b.\u0010\u0018\"\u0004\b/\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/withings/note/model/NoteEntity;", "", "noteHealthAttribute", "Lcom/withings/note/model/NoteHealthAttribute;", "(Lcom/withings/note/model/NoteHealthAttribute;)V", "text", "Lcom/withings/note/model/NoteText;", "(Lcom/withings/note/model/NoteText;)V", "noteId", "", "noteWsId", "noteGroupId", "localNoteGroupId", "noteDeleted", "", "type", "", "", "noteHealthAttributeId", "noteHealthAttributeLocalId", "signalId", "modified", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;ZILjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;J)V", "getLocalNoteGroupId", "()Ljava/lang/Long;", "setLocalNoteGroupId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getModified", "()J", "setModified", "(J)V", "getNoteDeleted", "()Z", "setNoteDeleted", "(Z)V", "getNoteGroupId", "setNoteGroupId", "getNoteHealthAttributeId", "setNoteHealthAttributeId", "getNoteHealthAttributeLocalId", "setNoteHealthAttributeLocalId", "getNoteId", "setNoteId", "getNoteWsId", "setNoteWsId", "getSignalId", "setSignalId", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getType", "()I", "setType", "(I)V", "toString", "note_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NoteEntity {
    private Long localNoteGroupId;
    private long modified;
    private boolean noteDeleted;
    @SerializedName("notegrpid")
    private Long noteGroupId;
    private Long noteHealthAttributeId;
    private Long noteHealthAttributeLocalId;
    private long noteId;
    private Long noteWsId;
    private Long signalId;
    private String text;
    private int type;

    public NoteEntity(long j5, Long l5, Long l6, Long l11, boolean z5, int i11, String str, Long l12, Long l13, Long l14, long j11) {
        this.noteId = j5;
        this.noteWsId = l5;
        this.noteGroupId = l6;
        this.localNoteGroupId = l11;
        this.noteDeleted = z5;
        this.type = i11;
        this.text = str;
        this.noteHealthAttributeId = l12;
        this.noteHealthAttributeLocalId = l13;
        this.signalId = l14;
        this.modified = j11;
    }

    public final Long getLocalNoteGroupId() {
        return this.localNoteGroupId;
    }

    public final long getModified() {
        return this.modified;
    }

    public final boolean getNoteDeleted() {
        return this.noteDeleted;
    }

    public final Long getNoteGroupId() {
        return this.noteGroupId;
    }

    public final Long getNoteHealthAttributeId() {
        return this.noteHealthAttributeId;
    }

    public final Long getNoteHealthAttributeLocalId() {
        return this.noteHealthAttributeLocalId;
    }

    public final long getNoteId() {
        return this.noteId;
    }

    public final Long getNoteWsId() {
        return this.noteWsId;
    }

    public final Long getSignalId() {
        return this.signalId;
    }

    public final String getText() {
        return this.text;
    }

    public final int getType() {
        return this.type;
    }

    public final void setLocalNoteGroupId(Long l5) {
        this.localNoteGroupId = l5;
    }

    public final void setModified(long j5) {
        this.modified = j5;
    }

    public final void setNoteDeleted(boolean z5) {
        this.noteDeleted = z5;
    }

    public final void setNoteGroupId(Long l5) {
        this.noteGroupId = l5;
    }

    public final void setNoteHealthAttributeId(Long l5) {
        this.noteHealthAttributeId = l5;
    }

    public final void setNoteHealthAttributeLocalId(Long l5) {
        this.noteHealthAttributeLocalId = l5;
    }

    public final void setNoteId(long j5) {
        this.noteId = j5;
    }

    public final void setNoteWsId(Long l5) {
        this.noteWsId = l5;
    }

    public final void setSignalId(Long l5) {
        this.signalId = l5;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setType(int i11) {
        this.type = i11;
    }

    public String toString() {
        int i11 = this.type;
        Long l5 = this.signalId;
        Long l6 = this.noteGroupId;
        Long l11 = this.localNoteGroupId;
        return "NoteEntity : type = " + i11 + ", signalId = " + l5 + ", noteGroupId = " + l6 + ", localNoteGroupId = " + l11;
    }

    public /* synthetic */ NoteEntity(long j5, Long l5, Long l6, Long l11, boolean z5, int i11, String str, Long l12, Long l13, Long l14, long j11, int i12, m mVar) {
        this((i12 & 1) != 0 ? 0L : j5, (i12 & 2) != 0 ? null : l5, (i12 & 4) != 0 ? null : l6, (i12 & 8) != 0 ? null : l11, (i12 & 16) != 0 ? false : z5, (i12 & 32) != 0 ? 0 : i11, (i12 & 64) != 0 ? null : str, (i12 & 128) != 0 ? null : l12, (i12 & 256) != 0 ? null : l13, (i12 & 512) != 0 ? null : l14, j11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NoteEntity(NoteHealthAttribute noteHealthAttribute) {
        this(noteHealthAttribute.getLocalId(), noteHealthAttribute.getWsId(), noteHealthAttribute.getNoteGroupId(), noteHealthAttribute.getLocalNoteGroupId(), noteHealthAttribute.getDeleted(), noteHealthAttribute.getType(), null, Long.valueOf(noteHealthAttribute.getHealthAttributeRemoteId()), noteHealthAttribute.getHealthAttributeLocalId(), null, noteHealthAttribute.getModified(), 576, null);
        u.j(noteHealthAttribute, "noteHealthAttribute");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NoteEntity(NoteText text) {
        this(text.getLocalId(), text.getWsId(), text.getNoteGroupId(), text.getLocalNoteGroupId(), text.getDeleted(), text.getType(), text.getText(), null, null, null, text.getModified(), ConstantsWs.HWFAILURE_ZERO, null);
        u.j(text, "text");
    }
}
