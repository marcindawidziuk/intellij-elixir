( (positional, key: value) when guard -> () )
( (positional, key: value) when guard -> function positional, key: value )
( (positional, key: value) when guard -> &one )
( (positional, key: value) when guard -> one \\ default )
( (positional, key: value) when guard -> one when key: value )
( (positional, key: value) when guard -> one when guard )
( (positional, key: value) when guard -> one :: type )
( (positional, key: value) when guard -> one | two )
( (positional, key: value) when guard -> one = two )
( (positional, key: value) when guard -> one or two )
( (positional, key: value) when guard -> one || two )
( (positional, key: value) when guard -> one and two )
( (positional, key: value) when guard -> one && two )
( (positional, key: value) when guard -> one != two )
( (positional, key: value) when guard -> one < two )
( (positional, key: value) when guard -> one + two )
( (positional, key: value) when guard -> one / two )
( (positional, key: value) when guard -> one * two )
( (positional, key: value) when guard -> one ^^^ two )
( (positional, key: value) when guard -> ! one )
( (positional, key: value) when guard -> not one )
( (positional, key: value) when guard -> Module.function positional, key: value )
( (positional, key: value) when guard -> @function positional, key: value )
( (positional, key: value) when guard -> function positional, key: value )
( (positional, key: value) when guard -> One.Two[key] )
( (positional, key: value) when guard -> Module.function[key] )
( (positional, key: value) when guard -> Module.function() )
( (positional, key: value) when guard -> Module.function )
( (positional, key: value) when guard -> @variable[key] )
( (positional, key: value) when guard -> @variable )
( (positional, key: value) when guard -> function positional, key: value )
( (positional, key: value) when guard -> variable[key] )
( (positional, key: value) when guard -> variable )
( (positional, key: value) when guard -> @1 )
( (positional, key: value) when guard -> &1 )
( (positional, key: value) when guard -> !1 )
( (positional, key: value) when guard -> not 1 )
( (positional, key: value) when guard -> ( (positional, key: value) when guard -> ) )
( (positional, key: value) when guard -> 1 )
( (positional, key: value) when guard -> [] )
( (positional, key: value) when guard -> "one" )
( (positional, key: value) when guard -> """
                                         one
                                         """ )
( (positional, key: value) when guard -> 'one' )
( (positional, key: value) when guard -> '''
                                         one
                                         ''' )
( (positional, key: value) when guard -> ~x{sigil}modifiers )
( (positional, key: value) when guard -> true )
( (positional, key: value) when guard -> :atom )
( (positional, key: value) when guard -> Alias )
