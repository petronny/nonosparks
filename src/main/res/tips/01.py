import json
tips='01'
data={}
data['tips']=[]
line={}
line['type']='text'
line['content']='More Tips:'
data['tips'].append(line)
line={}
line['type']='text'
line['content']='Start with the highest numbers.'
data['tips'].append(line)
line={}
line['type']='text'
line['content']='Some number combinations have only one solution.'
line={}
line['type']='example'
line['content']='examples/01-1.json'
data['tips'].append(line)
line={}
line['type']='example'
line['content']='examples/01-2.json'
data['tips'].append(line)
line={}
line['type']='example'
line['content']='examples/01-3.json'
data['tips'].append(line)
line={}
line['type']='text'
line['content']='Now you are ready to start solving and creating!'
data['tips'].append(line)

json.dump(data,open('tips/'+ tips +'.json','w'),sort_keys=True)
