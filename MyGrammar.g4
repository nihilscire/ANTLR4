grammar MyGrammar;

/*
 * Parser Rules
 */
 
root                : line+ EOF ;

line                : (comment_line | command_line) NEWLINE;

comment_line        : COMMENT ;

command_line        : CMD '.' (note_cmd | command);

command             : command_name ((COLON WHITESPACE*)? .*?)? ;

note_cmd            : NOTES COLON WHITESPACE* NEWLINE .*? (CMD '.'  END_NOTES COLON);

command_name        : WORD ;

/*`
 * Lexer Rules
 */

fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;
fragment DIGIT 		: [0-9] ;

NUMBER         	: DIGIT+ ([.,] DIGIT+)? ;

CMD 			: 'CMD';

NOTES           : 'NOTES';

END_NOTES       : 'END_NOTES';

COLON 			: ':' ;

COMMENT 		: '--' ~[\r\n]*;

WHITESPACE      : (' ' | '\t') ;

NEWLINE         : ('\r'? '\n' | '\r')+;

WORD            : (LOWERCASE | UPPERCASE | '_' | NUMBER)+ ;

TEXT            : 

/*
TEXT 			: 'TEXT:' ~[\r\n]+?;
*/