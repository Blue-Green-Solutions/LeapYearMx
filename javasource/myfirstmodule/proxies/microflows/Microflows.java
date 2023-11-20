// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies.microflows;

import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;

public final class Microflows
{
	/**
	 * Private constructor to prevent instantiation of this class. 
	 */
	private Microflows() {}

	// These are the microflows for the MyFirstModule module
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_AddFunctionsBuilder()
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MyFirstModule.ACT_AddFunctions");
		return builder;
	}

	public static void aCT_AddFunctions(IContext context)
	{
		aCT_AddFunctionsBuilder().execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_AddReverseFunctionsBuilder()
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MyFirstModule.ACT_AddReverseFunctions");
		return builder;
	}

	public static void aCT_AddReverseFunctions(IContext context)
	{
		aCT_AddReverseFunctionsBuilder().execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_BetweenFunctionsBuilder()
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MyFirstModule.ACT_BetweenFunctions");
		return builder;
	}

	public static void aCT_BetweenFunctions(IContext context)
	{
		aCT_BetweenFunctionsBuilder().execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_SubtractFunctionsBuilder()
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MyFirstModule.ACT_SubtractFunctions");
		return builder;
	}

	public static void aCT_SubtractFunctions(IContext context)
	{
		aCT_SubtractFunctionsBuilder().execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_SubtractReverseFunctionsBuilder()
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MyFirstModule.ACT_SubtractReverseFunctions");
		return builder;
	}

	public static void aCT_SubtractReverseFunctions(IContext context)
	{
		aCT_SubtractReverseFunctionsBuilder().execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder add1AllVariationsBuilder(
		java.util.Date _dateToAddTo,
		java.lang.String _context
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MyFirstModule.Add1AllVariations");
		builder = builder.withParam("DateToAddTo", _dateToAddTo);
		builder = builder.withParam("Context", _context);
		return builder;
	}

	public static void add1AllVariations(
		IContext context,
		java.util.Date _dateToAddTo,
		java.lang.String _context
	)
	{
		add1AllVariationsBuilder(
				_dateToAddTo,
				_context
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder addAndPrintBuilder(
		java.util.Date _addedDate,
		java.lang.String _description
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MyFirstModule.AddAndPrint");
		builder = builder.withParam("AddedDate", _addedDate);
		builder = builder.withParam("Description", _description);
		return builder;
	}

	public static void addAndPrint(
		IContext context,
		java.util.Date _addedDate,
		java.lang.String _description
	)
	{
		addAndPrintBuilder(
				_addedDate,
				_description
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder addReverse1AllVariationsBuilder(
		java.util.Date _dateToAddTo,
		java.lang.String _context
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MyFirstModule.AddReverse1AllVariations");
		builder = builder.withParam("DateToAddTo", _dateToAddTo);
		builder = builder.withParam("Context", _context);
		return builder;
	}

	public static void addReverse1AllVariations(
		IContext context,
		java.util.Date _dateToAddTo,
		java.lang.String _context
	)
	{
		addReverse1AllVariationsBuilder(
				_dateToAddTo,
				_context
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder betweenAllVariationsBuilder(
		java.util.Date _startDate,
		java.lang.String _context,
		java.util.Date _endDate
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MyFirstModule.BetweenAllVariations");
		builder = builder.withParam("StartDate", _startDate);
		builder = builder.withParam("Context", _context);
		builder = builder.withParam("EndDate", _endDate);
		return builder;
	}

	public static void betweenAllVariations(
		IContext context,
		java.util.Date _startDate,
		java.lang.String _context,
		java.util.Date _endDate
	)
	{
		betweenAllVariationsBuilder(
				_startDate,
				_context,
				_endDate
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder betweenAndPrintBuilder(
		java.util.Date _startDate,
		java.lang.String _description,
		java.util.Date _endDate,
		java.math.BigDecimal _output
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MyFirstModule.BetweenAndPrint");
		builder = builder.withParam("StartDate", _startDate);
		builder = builder.withParam("Description", _description);
		builder = builder.withParam("EndDate", _endDate);
		builder = builder.withParam("Output", _output);
		return builder;
	}

	public static void betweenAndPrint(
		IContext context,
		java.util.Date _startDate,
		java.lang.String _description,
		java.util.Date _endDate,
		java.math.BigDecimal _output
	)
	{
		betweenAndPrintBuilder(
				_startDate,
				_description,
				_endDate,
				_output
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder subtract1AllVariationsBuilder(
		java.util.Date _dateToSubtractFrom,
		java.lang.String _context
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MyFirstModule.Subtract1AllVariations");
		builder = builder.withParam("DateToSubtractFrom", _dateToSubtractFrom);
		builder = builder.withParam("Context", _context);
		return builder;
	}

	public static void subtract1AllVariations(
		IContext context,
		java.util.Date _dateToSubtractFrom,
		java.lang.String _context
	)
	{
		subtract1AllVariationsBuilder(
				_dateToSubtractFrom,
				_context
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder subtractAndPrintBuilder(
		java.util.Date _subtractedFromDate,
		java.lang.String _description
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MyFirstModule.SubtractAndPrint");
		builder = builder.withParam("SubtractedFromDate", _subtractedFromDate);
		builder = builder.withParam("Description", _description);
		return builder;
	}

	public static void subtractAndPrint(
		IContext context,
		java.util.Date _subtractedFromDate,
		java.lang.String _description
	)
	{
		subtractAndPrintBuilder(
				_subtractedFromDate,
				_description
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder subtractReverse1AllVariationsBuilder(
		java.util.Date _subtractedFromDate,
		java.lang.String _context
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MyFirstModule.SubtractReverse1AllVariations");
		builder = builder.withParam("SubtractedFromDate", _subtractedFromDate);
		builder = builder.withParam("Context", _context);
		return builder;
	}

	public static void subtractReverse1AllVariations(
		IContext context,
		java.util.Date _subtractedFromDate,
		java.lang.String _context
	)
	{
		subtractReverse1AllVariationsBuilder(
				_subtractedFromDate,
				_context
			)
			.execute(context);
	}
}