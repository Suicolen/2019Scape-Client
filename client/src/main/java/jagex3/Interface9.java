package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ade")
public interface Interface9 {

	@OriginalMember(owner = "client!ade", name = "n", descriptor = "(Lclient!alw;)Ljava/lang/Object;")
	Object method30451(@OriginalArg(0) Class93_Sub41 arg0);

	@OriginalMember(owner = "client!ade", name = "m", descriptor = "(Lclient!alw;)Ljava/lang/Object;")
	Object method30452(@OriginalArg(0) Class93_Sub41 arg0);

	@OriginalMember(owner = "client!ade", name = "e", descriptor = "(Lclient!alw;I)Ljava/lang/Object;")
	Object method30453(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1);
}