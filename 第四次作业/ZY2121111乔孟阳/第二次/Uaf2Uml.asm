<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="Uaf2Uml"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchDictionsry2Class():V"/>
		<constant value="__exec__"/>
		<constant value="Dictionsry2Class"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyDictionsry2Class(NTransientLink;):V"/>
		<constant value="__matchDictionsry2Class"/>
		<constant value="Dictionary"/>
		<constant value="Uaf"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="s"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="t"/>
		<constant value="Class"/>
		<constant value="Model"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="10:3-16:6"/>
		<constant value="__applyDictionsry2Class"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="alias"/>
		<constant value="nameOwner"/>
		<constant value="4"/>
		<constant value="J.getu(J):J"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="defination"/>
		<constant value="author"/>
		<constant value="J.+(J):J"/>
		<constant value="11:12-11:13"/>
		<constant value="11:12-11:19"/>
		<constant value="11:12-11:29"/>
		<constant value="12:17-12:27"/>
		<constant value="12:33-12:34"/>
		<constant value="12:17-12:35"/>
		<constant value="11:12-12:36"/>
		<constant value="13:7-13:8"/>
		<constant value="13:7-13:19"/>
		<constant value="13:7-13:26"/>
		<constant value="14:17-14:27"/>
		<constant value="14:33-14:34"/>
		<constant value="14:17-14:35"/>
		<constant value="13:7-14:36"/>
		<constant value="11:12-14:36"/>
		<constant value="11:4-14:36"/>
		<constant value="u"/>
		<constant value="link"/>
		<constant value="getu"/>
		<constant value="MUaf!UAFElement;"/>
		<constant value="relation"/>
		<constant value="URI"/>
		<constant value="23:12-23:13"/>
		<constant value="23:12-23:17"/>
		<constant value="23:4-23:17"/>
		<constant value="22:3-24:4"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="1"/>
		</localvariabletable>
	</operation>
	<operation name="41">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="42"/>
			<call arg="43"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="44"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="0" name="17" begin="0" end="9"/>
		</localvariabletable>
	</operation>
	<operation name="45">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="46"/>
			<push arg="47"/>
			<findme/>
			<push arg="48"/>
			<call arg="49"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="50"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="42"/>
			<pcall arg="51"/>
			<dup/>
			<push arg="52"/>
			<load arg="19"/>
			<pcall arg="53"/>
			<dup/>
			<push arg="54"/>
			<push arg="55"/>
			<push arg="56"/>
			<new/>
			<pcall arg="57"/>
			<pusht/>
			<pcall arg="58"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="59" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="52" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="60">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="61"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="52"/>
			<call arg="62"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="54"/>
			<call arg="63"/>
			<store arg="64"/>
			<load arg="64"/>
			<dup/>
			<getasm/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="29"/>
			<get arg="65"/>
			<get arg="66"/>
			<iterate/>
			<store arg="67"/>
			<getasm/>
			<load arg="67"/>
			<call arg="68"/>
			<call arg="69"/>
			<enditerate/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="29"/>
			<get arg="70"/>
			<get arg="71"/>
			<iterate/>
			<store arg="67"/>
			<getasm/>
			<load arg="67"/>
			<call arg="68"/>
			<call arg="69"/>
			<enditerate/>
			<call arg="72"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="73" begin="14" end="14"/>
			<lne id="74" begin="14" end="15"/>
			<lne id="75" begin="14" end="16"/>
			<lne id="76" begin="19" end="19"/>
			<lne id="77" begin="20" end="20"/>
			<lne id="78" begin="19" end="21"/>
			<lne id="79" begin="11" end="23"/>
			<lne id="80" begin="27" end="27"/>
			<lne id="81" begin="27" end="28"/>
			<lne id="82" begin="27" end="29"/>
			<lne id="83" begin="32" end="32"/>
			<lne id="84" begin="33" end="33"/>
			<lne id="85" begin="32" end="34"/>
			<lne id="86" begin="24" end="36"/>
			<lne id="87" begin="11" end="37"/>
			<lne id="88" begin="9" end="39"/>
			<lne id="59" begin="8" end="40"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="4" name="89" begin="18" end="22"/>
			<lve slot="4" name="89" begin="31" end="35"/>
			<lve slot="3" name="54" begin="7" end="40"/>
			<lve slot="2" name="52" begin="3" end="40"/>
			<lve slot="0" name="17" begin="0" end="40"/>
			<lve slot="1" name="90" begin="0" end="40"/>
		</localvariabletable>
	</operation>
	<operation name="91">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="92"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="50"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="91"/>
			<pcall arg="51"/>
			<dup/>
			<push arg="52"/>
			<load arg="19"/>
			<pcall arg="53"/>
			<dup/>
			<push arg="54"/>
			<push arg="93"/>
			<push arg="56"/>
			<new/>
			<dup/>
			<store arg="29"/>
			<pcall arg="57"/>
			<pushf/>
			<pcall arg="58"/>
			<load arg="29"/>
			<dup/>
			<getasm/>
			<load arg="19"/>
			<get arg="94"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
			<load arg="29"/>
		</code>
		<linenumbertable>
			<lne id="95" begin="25" end="25"/>
			<lne id="96" begin="25" end="26"/>
			<lne id="97" begin="23" end="28"/>
			<lne id="98" begin="22" end="29"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="54" begin="18" end="30"/>
			<lve slot="0" name="17" begin="0" end="30"/>
			<lve slot="1" name="52" begin="0" end="30"/>
		</localvariabletable>
	</operation>
</asm>
